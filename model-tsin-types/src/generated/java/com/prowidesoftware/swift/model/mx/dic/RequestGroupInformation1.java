
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Set of characteristics that unambiguously identify the global invoice financing request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestGroupInformation1", propOrder = {
    "grpId",
    "creDtTm",
    "authstn",
    "nbOfInvcReqs",
    "ttlBlkInvcAmt",
    "ccy",
    "fincgAgrmt",
    "fincgRqstr",
    "intrmyAgt",
    "frstAgt",
    "agrmtClauses",
    "addtlInf"
})
public class RequestGroupInformation1 {

    @XmlElement(name = "GrpId", required = true)
    protected String grpId;
    @XmlElement(name = "CreDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "Authstn")
    protected List<String> authstn;
    @XmlElement(name = "NbOfInvcReqs")
    protected String nbOfInvcReqs;
    @XmlElement(name = "TtlBlkInvcAmt")
    protected ActiveCurrencyAndAmount ttlBlkInvcAmt;
    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "FincgAgrmt")
    protected String fincgAgrmt;
    @XmlElement(name = "FincgRqstr", required = true)
    protected PartyIdentificationAndAccount6 fincgRqstr;
    @XmlElement(name = "IntrmyAgt")
    protected FinancialInstitutionIdentification6 intrmyAgt;
    @XmlElement(name = "FrstAgt", required = true)
    protected FinancialInstitutionIdentification6 frstAgt;
    @XmlElement(name = "AgrmtClauses")
    protected List<AgreementClauses1> agrmtClauses;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation1> addtlInf;

    /**
     * Gets the value of the grpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpId() {
        return grpId;
    }

    /**
     * Sets the value of the grpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequestGroupInformation1 setGrpId(String value) {
        this.grpId = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequestGroupInformation1 setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the authstn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authstn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthstn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAuthstn() {
        if (authstn == null) {
            authstn = new ArrayList<String>();
        }
        return this.authstn;
    }

    /**
     * Gets the value of the nbOfInvcReqs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfInvcReqs() {
        return nbOfInvcReqs;
    }

    /**
     * Sets the value of the nbOfInvcReqs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequestGroupInformation1 setNbOfInvcReqs(String value) {
        this.nbOfInvcReqs = value;
        return this;
    }

    /**
     * Gets the value of the ttlBlkInvcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlBlkInvcAmt() {
        return ttlBlkInvcAmt;
    }

    /**
     * Sets the value of the ttlBlkInvcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public RequestGroupInformation1 setTtlBlkInvcAmt(ActiveCurrencyAndAmount value) {
        this.ttlBlkInvcAmt = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequestGroupInformation1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the fincgAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFincgAgrmt() {
        return fincgAgrmt;
    }

    /**
     * Sets the value of the fincgAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequestGroupInformation1 setFincgAgrmt(String value) {
        this.fincgAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the fincgRqstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount6 }
     *     
     */
    public PartyIdentificationAndAccount6 getFincgRqstr() {
        return fincgRqstr;
    }

    /**
     * Sets the value of the fincgRqstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount6 }
     *     
     */
    public RequestGroupInformation1 setFincgRqstr(PartyIdentificationAndAccount6 value) {
        this.fincgRqstr = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public FinancialInstitutionIdentification6 getIntrmyAgt() {
        return intrmyAgt;
    }

    /**
     * Sets the value of the intrmyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public RequestGroupInformation1 setIntrmyAgt(FinancialInstitutionIdentification6 value) {
        this.intrmyAgt = value;
        return this;
    }

    /**
     * Gets the value of the frstAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public FinancialInstitutionIdentification6 getFrstAgt() {
        return frstAgt;
    }

    /**
     * Sets the value of the frstAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public RequestGroupInformation1 setFrstAgt(FinancialInstitutionIdentification6 value) {
        this.frstAgt = value;
        return this;
    }

    /**
     * Gets the value of the agrmtClauses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agrmtClauses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgrmtClauses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementClauses1 }
     * 
     * 
     */
    public List<AgreementClauses1> getAgrmtClauses() {
        if (agrmtClauses == null) {
            agrmtClauses = new ArrayList<AgreementClauses1>();
        }
        return this.agrmtClauses;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation1 }
     * 
     * 
     */
    public List<AdditionalInformation1> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<AdditionalInformation1>();
        }
        return this.addtlInf;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the authstn list.
     * @see #getAuthstn()
     * 
     */
    public RequestGroupInformation1 addAuthstn(String authstn) {
        getAuthstn().add(authstn);
        return this;
    }

    /**
     * Adds a new item to the agrmtClauses list.
     * @see #getAgrmtClauses()
     * 
     */
    public RequestGroupInformation1 addAgrmtClauses(AgreementClauses1 agrmtClauses) {
        getAgrmtClauses().add(agrmtClauses);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public RequestGroupInformation1 addAddtlInf(AdditionalInformation1 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
