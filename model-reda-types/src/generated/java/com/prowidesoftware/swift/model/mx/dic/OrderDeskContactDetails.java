
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
 * Communication device number or electronic address used for communication.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDeskContactDetails", propOrder = {
    "nm",
    "pstlAdr",
    "phneNb",
    "faxNb",
    "emailAdr",
    "id",
    "applFrms",
    "sgntrReqrdInitlSbcpt",
    "sgntrReqrdSbsqntSbcpt",
    "sgntrReqrdRed",
    "sbcptPrcgChrtcs",
    "redPrcgChrtcs",
    "sttlmDtls"
})
public class OrderDeskContactDetails {

    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "PstlAdr", required = true)
    protected PostalAddress1 pstlAdr;
    @XmlElement(name = "PhneNb", required = true)
    protected String phneNb;
    @XmlElement(name = "FaxNb", required = true)
    protected String faxNb;
    @XmlElement(name = "EmailAdr")
    protected String emailAdr;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "ApplFrms", required = true)
    protected Forms applFrms;
    @XmlElement(name = "SgntrReqrdInitlSbcpt", required = true)
    protected Forms sgntrReqrdInitlSbcpt;
    @XmlElement(name = "SgntrReqrdSbsqntSbcpt", required = true)
    protected Forms sgntrReqrdSbsqntSbcpt;
    @XmlElement(name = "SgntrReqrdRed", required = true)
    protected Forms sgntrReqrdRed;
    @XmlElement(name = "SbcptPrcgChrtcs", required = true)
    protected ProcessingCharacteristics1 sbcptPrcgChrtcs;
    @XmlElement(name = "RedPrcgChrtcs", required = true)
    protected ProcessingCharacteristics1 redPrcgChrtcs;
    @XmlElement(name = "SttlmDtls", required = true)
    protected List<CashAccount14> sttlmDtls;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderDeskContactDetails setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the pstlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress1 }
     *     
     */
    public PostalAddress1 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Sets the value of the pstlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress1 }
     *     
     */
    public OrderDeskContactDetails setPstlAdr(PostalAddress1 value) {
        this.pstlAdr = value;
        return this;
    }

    /**
     * Gets the value of the phneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhneNb() {
        return phneNb;
    }

    /**
     * Sets the value of the phneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderDeskContactDetails setPhneNb(String value) {
        this.phneNb = value;
        return this;
    }

    /**
     * Gets the value of the faxNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNb() {
        return faxNb;
    }

    /**
     * Sets the value of the faxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderDeskContactDetails setFaxNb(String value) {
        this.faxNb = value;
        return this;
    }

    /**
     * Gets the value of the emailAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAdr() {
        return emailAdr;
    }

    /**
     * Sets the value of the emailAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderDeskContactDetails setEmailAdr(String value) {
        this.emailAdr = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderDeskContactDetails setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the applFrms property.
     * 
     * @return
     *     possible object is
     *     {@link Forms }
     *     
     */
    public Forms getApplFrms() {
        return applFrms;
    }

    /**
     * Sets the value of the applFrms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Forms }
     *     
     */
    public OrderDeskContactDetails setApplFrms(Forms value) {
        this.applFrms = value;
        return this;
    }

    /**
     * Gets the value of the sgntrReqrdInitlSbcpt property.
     * 
     * @return
     *     possible object is
     *     {@link Forms }
     *     
     */
    public Forms getSgntrReqrdInitlSbcpt() {
        return sgntrReqrdInitlSbcpt;
    }

    /**
     * Sets the value of the sgntrReqrdInitlSbcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Forms }
     *     
     */
    public OrderDeskContactDetails setSgntrReqrdInitlSbcpt(Forms value) {
        this.sgntrReqrdInitlSbcpt = value;
        return this;
    }

    /**
     * Gets the value of the sgntrReqrdSbsqntSbcpt property.
     * 
     * @return
     *     possible object is
     *     {@link Forms }
     *     
     */
    public Forms getSgntrReqrdSbsqntSbcpt() {
        return sgntrReqrdSbsqntSbcpt;
    }

    /**
     * Sets the value of the sgntrReqrdSbsqntSbcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Forms }
     *     
     */
    public OrderDeskContactDetails setSgntrReqrdSbsqntSbcpt(Forms value) {
        this.sgntrReqrdSbsqntSbcpt = value;
        return this;
    }

    /**
     * Gets the value of the sgntrReqrdRed property.
     * 
     * @return
     *     possible object is
     *     {@link Forms }
     *     
     */
    public Forms getSgntrReqrdRed() {
        return sgntrReqrdRed;
    }

    /**
     * Sets the value of the sgntrReqrdRed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Forms }
     *     
     */
    public OrderDeskContactDetails setSgntrReqrdRed(Forms value) {
        this.sgntrReqrdRed = value;
        return this;
    }

    /**
     * Gets the value of the sbcptPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics1 }
     *     
     */
    public ProcessingCharacteristics1 getSbcptPrcgChrtcs() {
        return sbcptPrcgChrtcs;
    }

    /**
     * Sets the value of the sbcptPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics1 }
     *     
     */
    public OrderDeskContactDetails setSbcptPrcgChrtcs(ProcessingCharacteristics1 value) {
        this.sbcptPrcgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the redPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics1 }
     *     
     */
    public ProcessingCharacteristics1 getRedPrcgChrtcs() {
        return redPrcgChrtcs;
    }

    /**
     * Sets the value of the redPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics1 }
     *     
     */
    public OrderDeskContactDetails setRedPrcgChrtcs(ProcessingCharacteristics1 value) {
        this.redPrcgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount14 }
     * 
     * 
     * @return
     *     The value of the sttlmDtls property.
     */
    public List<CashAccount14> getSttlmDtls() {
        if (sttlmDtls == null) {
            sttlmDtls = new ArrayList<>();
        }
        return this.sttlmDtls;
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
     * Adds a new item to the sttlmDtls list.
     * @see #getSttlmDtls()
     * 
     */
    public OrderDeskContactDetails addSttlmDtls(CashAccount14 sttlmDtls) {
        getSttlmDtls().add(sttlmDtls);
        return this;
    }

}
