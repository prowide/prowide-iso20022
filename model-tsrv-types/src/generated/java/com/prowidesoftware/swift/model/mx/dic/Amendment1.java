
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the amendment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amendment1", propOrder = {
    "seqNb",
    "dtOfIssnc",
    "udrtkgId",
    "advsgPty",
    "scndAdvsgPty",
    "termntnDtls",
    "udrtkgAmtAdjstmnt",
    "newXpryDtls",
    "newBnfcry",
    "newUdrtkgTermsAndConds",
    "lclUdrtkg",
    "bnfcryCnsntReqInd",
    "dlvryChanl",
    "nclsdFile",
    "addtlInf"
})
public class Amendment1 {

    @XmlElement(name = "SeqNb", required = true)
    protected String seqNb;
    @XmlElement(name = "DtOfIssnc", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfIssnc;
    @XmlElement(name = "UdrtkgId", required = true)
    protected Undertaking7 udrtkgId;
    @XmlElement(name = "AdvsgPty")
    protected PartyIdentification43 advsgPty;
    @XmlElement(name = "ScndAdvsgPty")
    protected PartyIdentification43 scndAdvsgPty;
    @XmlElement(name = "TermntnDtls")
    protected UndertakingTermination3 termntnDtls;
    @XmlElement(name = "UdrtkgAmtAdjstmnt")
    protected UndertakingAmount2 udrtkgAmtAdjstmnt;
    @XmlElement(name = "NewXpryDtls")
    protected ExpiryDetails1 newXpryDtls;
    @XmlElement(name = "NewBnfcry")
    protected PartyIdentification43 newBnfcry;
    @XmlElement(name = "NewUdrtkgTermsAndConds")
    protected List<Narrative1> newUdrtkgTermsAndConds;
    @XmlElement(name = "LclUdrtkg")
    protected Undertaking11 lclUdrtkg;
    @XmlElement(name = "BnfcryCnsntReqInd")
    protected Boolean bnfcryCnsntReqInd;
    @XmlElement(name = "DlvryChanl")
    protected CommunicationChannel1 dlvryChanl;
    @XmlElement(name = "NclsdFile")
    protected List<Document9> nclsdFile;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Amendment1 setSeqNb(String value) {
        this.seqNb = value;
        return this;
    }

    /**
     * Gets the value of the dtOfIssnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDtOfIssnc() {
        return dtOfIssnc;
    }

    /**
     * Sets the value of the dtOfIssnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Amendment1 setDtOfIssnc(XMLGregorianCalendar value) {
        this.dtOfIssnc = value;
        return this;
    }

    /**
     * Gets the value of the udrtkgId property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking7 }
     *     
     */
    public Undertaking7 getUdrtkgId() {
        return udrtkgId;
    }

    /**
     * Sets the value of the udrtkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking7 }
     *     
     */
    public Amendment1 setUdrtkgId(Undertaking7 value) {
        this.udrtkgId = value;
        return this;
    }

    /**
     * Gets the value of the advsgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getAdvsgPty() {
        return advsgPty;
    }

    /**
     * Sets the value of the advsgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Amendment1 setAdvsgPty(PartyIdentification43 value) {
        this.advsgPty = value;
        return this;
    }

    /**
     * Gets the value of the scndAdvsgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getScndAdvsgPty() {
        return scndAdvsgPty;
    }

    /**
     * Sets the value of the scndAdvsgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Amendment1 setScndAdvsgPty(PartyIdentification43 value) {
        this.scndAdvsgPty = value;
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
    public Amendment1 setTermntnDtls(UndertakingTermination3 value) {
        this.termntnDtls = value;
        return this;
    }

    /**
     * Gets the value of the udrtkgAmtAdjstmnt property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmount2 }
     *     
     */
    public UndertakingAmount2 getUdrtkgAmtAdjstmnt() {
        return udrtkgAmtAdjstmnt;
    }

    /**
     * Sets the value of the udrtkgAmtAdjstmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmount2 }
     *     
     */
    public Amendment1 setUdrtkgAmtAdjstmnt(UndertakingAmount2 value) {
        this.udrtkgAmtAdjstmnt = value;
        return this;
    }

    /**
     * Gets the value of the newXpryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDetails1 }
     *     
     */
    public ExpiryDetails1 getNewXpryDtls() {
        return newXpryDtls;
    }

    /**
     * Sets the value of the newXpryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDetails1 }
     *     
     */
    public Amendment1 setNewXpryDtls(ExpiryDetails1 value) {
        this.newXpryDtls = value;
        return this;
    }

    /**
     * Gets the value of the newBnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getNewBnfcry() {
        return newBnfcry;
    }

    /**
     * Sets the value of the newBnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Amendment1 setNewBnfcry(PartyIdentification43 value) {
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
     * Gets the value of the lclUdrtkg property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking11 }
     *     
     */
    public Undertaking11 getLclUdrtkg() {
        return lclUdrtkg;
    }

    /**
     * Sets the value of the lclUdrtkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking11 }
     *     
     */
    public Amendment1 setLclUdrtkg(Undertaking11 value) {
        this.lclUdrtkg = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryCnsntReqInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBnfcryCnsntReqInd() {
        return bnfcryCnsntReqInd;
    }

    /**
     * Sets the value of the bnfcryCnsntReqInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Amendment1 setBnfcryCnsntReqInd(Boolean value) {
        this.bnfcryCnsntReqInd = value;
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
    public Amendment1 setDlvryChanl(CommunicationChannel1 value) {
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
    public Amendment1 addNewUdrtkgTermsAndConds(Narrative1 newUdrtkgTermsAndConds) {
        getNewUdrtkgTermsAndConds().add(newUdrtkgTermsAndConds);
        return this;
    }

    /**
     * Adds a new item to the nclsdFile list.
     * @see #getNclsdFile()
     * 
     */
    public Amendment1 addNclsdFile(Document9 nclsdFile) {
        getNclsdFile().add(nclsdFile);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public Amendment1 addAddtlInf(String addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
