package jms;


import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        ConnectionFactory cf = null;
        Connection conn = null;
        QueueSession qSession = null;
        Queue q = null;
        QueueReceiver qReceiver = null;  // Получатель сообщений из очереди
        try {
            Properties props = new Properties();

            props.setProperty(Context.INITIAL_CONTEXT_FACTORY,
                    "org.activemq.jndi.ActiveMQInitialContextFactory");
            props.setProperty(Context.PROVIDER_URL, "tcp://localhost:61616");

            Context initContext = new InitialContext(props);

            Object obj = initContext.lookup("QueueConnectionFactory");
            if (obj != null) {
                cf = (ConnectionFactory) obj;
            } else
                System.out.println("Connection factory lookup failure...");


            // Поиск (или создание) динамической очереди
            q = (Queue) initContext.lookup("dynamicQueues/MyQ");

            conn = cf.createConnection();
            qSession = (QueueSession) conn.createSession(false,
                    Session.AUTO_ACKNOWLEDGE);

            // Создание получателя сообщений, не использующего фильтров
            qReceiver = (QueueReceiver) qSession.createReceiver(q, null);

            conn.start();

            // Попытка получить несколько сообщений из очереди в синхронном режиме.
            // Если сообщений нет, вызов метода receive() блокирует поток, вызвавший
            // этот метод. Предполагается, что отправитель помещает в данную очередь
            // только текстовые сообщений

            int count = 5;
            while (count > 0) {
                Message m = qReceiver.receive();
                TextMessage tm = (TextMessage) m;
                System.out.println(tm.getText());
                count--;
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
