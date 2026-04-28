
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the amendent request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amendment3", propOrder = {
    "applcntReqNb",
    "udrtkgId",
    "applcnt",
    "termntnDtls",
    "incrDcrAmt",
    "newXpryDtls",
    "newBnfcry",
    "newUdrtkgTermsAndConds",
    "cntrUdrtkg",
    "dlvryChanl",
    "nclsdFile",
    "addtlInf"
})
public class Amendment3 {

    @XmlElement(name = "ApplcntReqNb", required = true)
    protected String applcntReqNb;
    @XmlElement(name = "UdrtkgId", required = true)
    protected Undertaking9 udrtkgId;
    @XmlElement(name = "Applcnt", required = true)
    protected PartyIdentification43 applcnt;
    @XmlElement(name = "TermntnDtls")
    protected UndertakingTermination3 termntnDtls;
    @XmlElement(name = "IncrDcrAmt")
    protected UndertakingAmount2 incrDcrAmt;
    @XmlElement(name = "NewXpryDtls")
    protected ExpiryDetails2 newXpryDtls;
    @XmlElement(name = "NewBnfcry")
    protected Beneficiary1 newBnfcry;
    @XmlElement(name = "NewUdrtkgTermsAndConds")
    protected List<Narrative1> newUdrtkgTermsAndConds;
    @XmlElement(name = "CntrUdrtkg")
    protected Undertaking10 cntrUdrtkg;
    @XmlElement(name = "DlvryChanl")
    protected CommunicationChannel1 dlvryChanl;
    @XmlElement(name = "NclsdFile")
    protected List<Document9> nclsdFile;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the applcntReqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplcntReqNb() {
        return applcntReqNb;
    }

    /**
     * Sets the value of the applcntReqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Amendment3 setApplcntReqNb(String value) {
        this.applcntReqNb = value;
        return this;
    }

    /**
     * Gets the value of the udrtkgId property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking9 }
     *     
     */
    public Undertaking9 getUdrtkgId() {
        return udrtkgId;
    }

    /**
     * Sets the value of the udrtkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking9 }
     *     
     */
    public Amendment3 setUdrtkgId(Undertaking9 value) {
        this.udrtkgId = value;
        return this;
    }

    /**
     * Gets the value of the applcnt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getApplcnt() {
        return applcnt;
    }

    /**
     * Sets the value of the applcnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Amendment3 setApplcnt(PartyIdentification43 value) {
        this.applcnt = value;
        return this;
    }

    /**
     * Gets the value of the termntnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingTermination3 }
     *     
     */
    public UndertakingTermination3 getTermntnDtls() {
        return termntnDtls;
    }

    /**
     * Sets the value of the termntnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingTermination3 }
     *     
     */
    public Amendment3 setTermntnDtls(UndertakingTermination3 value) {
        this.termntnDtls = value;
        return this;
    }

    /**
     * Gets the value of the incrDcrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmount2 }
     *     
     */
    public UndertakingAmount2 getIncrDcrAmt() {
        return incrDcrAmt;
    }

    /**
     * Sets the value of the incrDcrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmount2 }
     *     
     */
    public Amendment3 setIncrDcrAmt(UndertakingAmount2 value) {
        this.incrDcrAmt = value;
        return this;
    }

    /**
     * Gets the value of the newXpryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDetails2 }
     *     
     */
    public ExpiryDetails2 getNewXpryDtls() {
        return newXpryDtls;
    }

    /**
     * Sets the value of the newXpryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDetails2 }
     *     
     */
    public Amendment3 setNewXpryDtls(ExpiryDetails2 value) {
        this.newXpryDtls = value;
        return this;
    }

    /**
     * Gets the value of the newBnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link Beneficiary1 }
     *     
     */
    public Beneficiary1 getNewBnfcry() {
        return newBnfcry;
    }

    /**
     * Sets the value of the newBnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Beneficiary1 }
     *     
     */
    public Amendment3 setNewBnfcry(Beneficiary1 value) {
        this.newBnfcry = value;
        return this;
    }

    /**
     * Gets the value of the newUdrtkgTermsAndConds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newUdrtkgTermsAndConds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewUdrtkgTermsAndConds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Narrative1 }
     * 
     * 
     */
    public List<Narrative1> getNewUdrtkgTermsAndConds() {
        if (newUdrtkgTermsAndConds == null) {
            newUdrtkgTermsAndConds = new ArrayList<Narrative1>();
        }
        return this.newUdrtkgTermsAndConds;
    }

    /**
     * Gets the value of the cntrUdrtkg property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking10 }
     *     
     */
    public Undertaking10 getCntrUdrtkg() {
        return cntrUdrtkg;
    }

    /**
     * Sets the value of the cntrUdrtkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking10 }
     *     
     */
    public Amendment3 setCntrUdrtkg(Undertaking10 value) {
        this.cntrUdrtkg = value;
        return this;
    }

    /**
     * Gets the value of the dlvryChanl property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationChannel1 }
     *     
     */
    public CommunicationChannel1 getDlvryChanl() {
        return dlvryChanl;
    }

    /**
     * Sets the value of the dlvryChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationChannel1 }
     *     
     */
    public Amendment3 setDlvryChanl(CommunicationChannel1 value) {
        this.dlvryChanl = value;
        return this;
    }

    /**
     * Gets the value of the nclsdFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nclsdFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNclsdFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document9 }
     * 
     * 
     */
    public List<Document9> getNclsdFile() {
        if (nclsdFile == null) {
            nclsdFile = new ArrayList<Document9>();
        }
        return this.nclsdFile;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<String>();
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
     * Adds a new item to the newUdrtkgTermsAndConds list.
     * @see #getNewUdrtkgTermsAndConds()
     * 
     */
    public Amendment3 addNewUdrtkgTermsAndConds(Narrative1 newUdrtkgTermsAndConds) {
        getNewUdrtkgTermsAndConds().add(newUdrtkgTermsAndConds);
        return this;
    }

    /**
     * Adds a new item to the nclsdFile list.
     * @see #getNclsdFile()
     * 
     */
    public Amendment3 addNclsdFile(Document9 nclsdFile) {
        getNclsdFile().add(nclsdFile);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public Amendment3 addAddtlInf(String addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
