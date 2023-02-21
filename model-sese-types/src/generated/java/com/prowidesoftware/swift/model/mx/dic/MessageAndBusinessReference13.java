
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about the message reference of the message for which the status is requested and the business reference of the transfer instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageAndBusinessReference13", propOrder = {
    "ref",
    "tpOfReq",
    "mstrRef",
    "trfRef",
    "clntRef",
    "cxlRef",
    "instrm",
    "invstmtAcctDtls",
    "intrmyInf",
    "qryInf",
    "reqIssr",
    "reqRcpt"
})
public class MessageAndBusinessReference13 {

    @XmlElement(name = "Ref")
    protected References68Choice ref;
    @XmlElement(name = "TpOfReq")
    protected TypeOfRequest1Choice tpOfReq;
    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfRef", required = true)
    protected String trfRef;
    @XmlElement(name = "ClntRef")
    protected AdditionalReference10 clntRef;
    @XmlElement(name = "CxlRef")
    protected String cxlRef;
    @XmlElement(name = "Instrm")
    protected FinancialInstrument63Choice instrm;
    @XmlElement(name = "InvstmtAcctDtls")
    protected Account33 invstmtAcctDtls;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary48> intrmyInf;
    @XmlElement(name = "QryInf")
    protected List<AdditionalInformation25> qryInf;
    @XmlElement(name = "ReqIssr")
    protected PartyIdentification139 reqIssr;
    @XmlElement(name = "ReqRcpt")
    protected PartyIdentification139 reqRcpt;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References68Choice }
     *     
     */
    public References68Choice getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References68Choice }
     *     
     */
    public MessageAndBusinessReference13 setRef(References68Choice value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the tpOfReq property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfRequest1Choice }
     *     
     */
    public TypeOfRequest1Choice getTpOfReq() {
        return tpOfReq;
    }

    /**
     * Sets the value of the tpOfReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfRequest1Choice }
     *     
     */
    public MessageAndBusinessReference13 setTpOfReq(TypeOfRequest1Choice value) {
        this.tpOfReq = value;
        return this;
    }

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MessageAndBusinessReference13 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the trfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfRef() {
        return trfRef;
    }

    /**
     * Sets the value of the trfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MessageAndBusinessReference13 setTrfRef(String value) {
        this.trfRef = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public MessageAndBusinessReference13 setClntRef(AdditionalReference10 value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the cxlRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRef() {
        return cxlRef;
    }

    /**
     * Sets the value of the cxlRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MessageAndBusinessReference13 setCxlRef(String value) {
        this.cxlRef = value;
        return this;
    }

    /**
     * Gets the value of the instrm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument63Choice }
     *     
     */
    public FinancialInstrument63Choice getInstrm() {
        return instrm;
    }

    /**
     * Sets the value of the instrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument63Choice }
     *     
     */
    public MessageAndBusinessReference13 setInstrm(FinancialInstrument63Choice value) {
        this.instrm = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Account33 }
     *     
     */
    public Account33 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account33 }
     *     
     */
    public MessageAndBusinessReference13 setInvstmtAcctDtls(Account33 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the intrmyInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrmyInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmyInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary48 }
     * 
     * 
     */
    public List<Intermediary48> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<Intermediary48>();
        }
        return this.intrmyInf;
    }

    /**
     * Gets the value of the qryInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qryInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQryInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation25 }
     * 
     * 
     */
    public List<AdditionalInformation25> getQryInf() {
        if (qryInf == null) {
            qryInf = new ArrayList<AdditionalInformation25>();
        }
        return this.qryInf;
    }

    /**
     * Gets the value of the reqIssr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getReqIssr() {
        return reqIssr;
    }

    /**
     * Sets the value of the reqIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public MessageAndBusinessReference13 setReqIssr(PartyIdentification139 value) {
        this.reqIssr = value;
        return this;
    }

    /**
     * Gets the value of the reqRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getReqRcpt() {
        return reqRcpt;
    }

    /**
     * Sets the value of the reqRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public MessageAndBusinessReference13 setReqRcpt(PartyIdentification139 value) {
        this.reqRcpt = value;
        return this;
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
     * Adds a new item to the intrmyInf list.
     * @see #getIntrmyInf()
     * 
     */
    public MessageAndBusinessReference13 addIntrmyInf(Intermediary48 intrmyInf) {
        getIntrmyInf().add(intrmyInf);
        return this;
    }

    /**
     * Adds a new item to the qryInf list.
     * @see #getQryInf()
     * 
     */
    public MessageAndBusinessReference13 addQryInf(AdditionalInformation25 qryInf) {
        getQryInf().add(qryInf);
        return this;
    }

}
