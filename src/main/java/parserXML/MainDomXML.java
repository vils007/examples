package parserXML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 27.07.2017.
 */
public class MainDomXML {
    public static void main(String[] args) {
        try
        {
            File xmlFile = new File("file.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(xmlFile);
            document.getDocumentElement().normalize();

            System.out.println("Корневой элемент: " + document.getDocumentElement().getNodeName());
            NodeList nodeList = document.getElementsByTagName(document.getDocumentElement().getChildNodes().item(1).getNodeName());
            System.out.println("--------------------");
            for(int tmp = 0; tmp < nodeList.getLength(); tmp++)
            {
                Node node = nodeList.item(tmp);
                if(node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element element = (Element)node;
                    System.out.println("Author: " + element.getElementsByTagName("AgreeProgramRule").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("Language: " + element.getElementsByTagName("SecretQuestion").item(0).getChildNodes().item(0).getNodeValue());
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
        //
    }



class Member {
    private String _AgreeProgramRule,
            _SecretQuestion,
            _SecretQuestionAnswer,
            _PointExpireDate,
            _TierLevel,
            _MealCode,
            _TierEndDate,
            _AwardPass,
            _AwardDoubleMiles,
            _PointsEffectiveDate,
            _SpecialMember,
            _EmailDuplicate,
            _MilesTotal,
            _MemberNumber,
            _MilesBalance,
            _QualifyingSegments,
            _BusinessClassSegments,
            _QualifyingMiles,
            _RegDate,
            _Status;
    private ListOfContact listOfContact;
    private ListOfFellowTraveler listOfFellowTraveler;
    private ListOfHomeAirport listOfHomeAirport;
    private ListOfLoyaltyProgram listOfLoyaltyProgram;

    private static class ListOfContact {

    }

    private static class ListOfLoyaltyProgram {

    }

    private static class ListOfHomeAirport {

    }

    private static class ListOfFellowTraveler {

    }
    public String get_AgreeProgramRule() {
        return _AgreeProgramRule;
    }

    public void set_AgreeProgramRule(String _AgreeProgramRule) {
        this._AgreeProgramRule = _AgreeProgramRule;
    }

    public String get_SecretQuestion() {
        return _SecretQuestion;
    }

    public void set_SecretQuestion(String _SecretQuestion) {
        this._SecretQuestion = _SecretQuestion;
    }

    public String get_SecretQuestionAnswer() {
        return _SecretQuestionAnswer;
    }

    public void set_SecretQuestionAnswer(String _SecretQuestionAnswer) {
        this._SecretQuestionAnswer = _SecretQuestionAnswer;
    }

    public String get_PointExpireDate() {
        return _PointExpireDate;
    }

    public void set_PointExpireDate(String _PointExpireDate) {
        this._PointExpireDate = _PointExpireDate;
    }

    public String get_TierLevel() {
        return _TierLevel;
    }

    public void set_TierLevel(String _TierLevel) {
        this._TierLevel = _TierLevel;
    }

    public String get_MealCode() {
        return _MealCode;
    }

    public void set_MealCode(String _MealCode) {
        this._MealCode = _MealCode;
    }

    public String get_TierEndDate() {
        return _TierEndDate;
    }

    public void set_TierEndDate(String _TierEndDate) {
        this._TierEndDate = _TierEndDate;
    }

    public String get_AwardPass() {
        return _AwardPass;
    }

    public void set_AwardPass(String _AwardPass) {
        this._AwardPass = _AwardPass;
    }

    public String get_AwardDoubleMiles() {
        return _AwardDoubleMiles;
    }

    public void set_AwardDoubleMiles(String _AwardDoubleMiles) {
        this._AwardDoubleMiles = _AwardDoubleMiles;
    }

    public String get_PointsEffectiveDate() {
        return _PointsEffectiveDate;
    }

    public void set_PointsEffectiveDate(String _PointsEffectiveDate) {
        this._PointsEffectiveDate = _PointsEffectiveDate;
    }

    public String get_SpecialMember() {
        return _SpecialMember;
    }

    public void set_SpecialMember(String _SpecialMember) {
        this._SpecialMember = _SpecialMember;
    }

    public String get_EmailDuplicate() {
        return _EmailDuplicate;
    }

    public void set_EmailDuplicate(String _EmailDuplicate) {
        this._EmailDuplicate = _EmailDuplicate;
    }

    public String get_MilesTotal() {
        return _MilesTotal;
    }

    public void set_MilesTotal(String _MilesTotal) {
        this._MilesTotal = _MilesTotal;
    }

    public String get_MemberNumber() {
        return _MemberNumber;
    }

    public void set_MemberNumber(String _MemberNumber) {
        this._MemberNumber = _MemberNumber;
    }

    public String get_MilesBalance() {
        return _MilesBalance;
    }

    public void set_MilesBalance(String _MilesBalance) {
        this._MilesBalance = _MilesBalance;
    }

    public String get_QualifyingSegments() {
        return _QualifyingSegments;
    }

    public void set_QualifyingSegments(String _QualifyingSegments) {
        this._QualifyingSegments = _QualifyingSegments;
    }

    public String get_BusinessClassSegments() {
        return _BusinessClassSegments;
    }

    public void set_BusinessClassSegments(String _BusinessClassSegments) {
        this._BusinessClassSegments = _BusinessClassSegments;
    }

    public String get_QualifyingMiles() {
        return _QualifyingMiles;
    }

    public void set_QualifyingMiles(String _QualifyingMiles) {
        this._QualifyingMiles = _QualifyingMiles;
    }

    public String get_RegDate() {
        return _RegDate;
    }

    public void set_RegDate(String _RegDate) {
        this._RegDate = _RegDate;
    }

    public String get_Status() {
        return _Status;
    }

    public void set_Status(String _Status) {
        this._Status = _Status;
    }
}