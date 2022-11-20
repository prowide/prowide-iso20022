
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Indicates to the card issuer the level of risk associated with the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskAssessment2", propOrder = {
    "rskAssmntNtty",
    "rskAssmntTp",
    "hghRskTx",
    "rsn",
    "rslt",
    "rskCond",
    "addtlRskData",
    "rcmmnddActn",
    "othrRcmmnddActn",
    "rcmmnddActnDtls"
})
public class RiskAssessment2 {

    @XmlElement(name = "RskAssmntNtty")
    protected PartyIdentification200 rskAssmntNtty;
    @XmlElement(name = "RskAssmntTp")
    protected String rskAssmntTp;
    @XmlElement(name = "HghRskTx")
    protected Boolean hghRskTx;
    @XmlElement(name = "Rsn")
    protected List<String> rsn;
    @XmlElement(name = "Rslt")
    protected String rslt;
    @XmlElement(name = "RskCond")
    protected List<AdditionalData1> rskCond;
    @XmlElement(name = "AddtlRskData")
    protected List<AdditionalRiskData1> addtlRskData;
    @XmlElement(name = "RcmmnddActn")
    @XmlSchemaType(name = "string")
    protected List<ActionType8Code> rcmmnddActn;
    @XmlElement(name = "OthrRcmmnddActn")
    protected String othrRcmmnddActn;
    @XmlElement(name = "RcmmnddActnDtls")
    protected String rcmmnddActnDtls;

    /**
     * Gets the value of the rskAssmntNtty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification200 }
     *     
     */
    public PartyIdentification200 getRskAssmntNtty() {
        return rskAssmntNtty;
    }

    /**
     * Sets the value of the rskAssmntNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification200 }
     *     
     */
    public RiskAssessment2 setRskAssmntNtty(PartyIdentification200 value) {
        this.rskAssmntNtty = value;
        return this;
    }

    /**
     * Gets the value of the rskAssmntTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRskAssmntTp() {
        return rskAssmntTp;
    }

    /**
     * Sets the value of the rskAssmntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RiskAssessment2 setRskAssmntTp(String value) {
        this.rskAssmntTp = value;
        return this;
    }

    /**
     * Gets the value of the hghRskTx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHghRskTx() {
        return hghRskTx;
    }

    /**
     * Sets the value of the hghRskTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RiskAssessment2 setHghRskTx(Boolean value) {
        this.hghRskTx = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<String>();
        }
        return this.rsn;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RiskAssessment2 setRslt(String value) {
        this.rslt = value;
        return this;
    }

    /**
     * Gets the value of the rskCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rskCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRskCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getRskCond() {
        if (rskCond == null) {
            rskCond = new ArrayList<AdditionalData1>();
        }
        return this.rskCond;
    }

    /**
     * Gets the value of the addtlRskData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlRskData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRskData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalRiskData1 }
     * 
     * 
     */
    public List<AdditionalRiskData1> getAddtlRskData() {
        if (addtlRskData == null) {
            addtlRskData = new ArrayList<AdditionalRiskData1>();
        }
        return this.addtlRskData;
    }

    /**
     * Gets the value of the rcmmnddActn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcmmnddActn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcmmnddActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionType8Code }
     * 
     * 
     */
    public List<ActionType8Code> getRcmmnddActn() {
        if (rcmmnddActn == null) {
            rcmmnddActn = new ArrayList<ActionType8Code>();
        }
        return this.rcmmnddActn;
    }

    /**
     * Gets the value of the othrRcmmnddActn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRcmmnddActn() {
        return othrRcmmnddActn;
    }

    /**
     * Sets the value of the othrRcmmnddActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RiskAssessment2 setOthrRcmmnddActn(String value) {
        this.othrRcmmnddActn = value;
        return this;
    }

    /**
     * Gets the value of the rcmmnddActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcmmnddActnDtls() {
        return rcmmnddActnDtls;
    }

    /**
     * Sets the value of the rcmmnddActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RiskAssessment2 setRcmmnddActnDtls(String value) {
        this.rcmmnddActnDtls = value;
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
     * Adds a new item to the rsn list.
     * @see #getRsn()
     * 
     */
    public RiskAssessment2 addRsn(String rsn) {
        getRsn().add(rsn);
        return this;
    }

    /**
     * Adds a new item to the rskCond list.
     * @see #getRskCond()
     * 
     */
    public RiskAssessment2 addRskCond(AdditionalData1 rskCond) {
        getRskCond().add(rskCond);
        return this;
    }

    /**
     * Adds a new item to the addtlRskData list.
     * @see #getAddtlRskData()
     * 
     */
    public RiskAssessment2 addAddtlRskData(AdditionalRiskData1 addtlRskData) {
        getAddtlRskData().add(addtlRskData);
        return this;
    }

    /**
     * Adds a new item to the rcmmnddActn list.
     * @see #getRcmmnddActn()
     * 
     */
    public RiskAssessment2 addRcmmnddActn(ActionType8Code rcmmnddActn) {
        getRcmmnddActn().add(rcmmnddActn);
        return this;
    }

}
