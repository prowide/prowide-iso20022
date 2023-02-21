
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information regarding custodian service record.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustodianDetailsSD1", propOrder = {
    "plcAndNm",
    "ctdnCorpActnRcrdId",
    "agrInd",
    "cmpltnsInd",
    "ctdnActnInd",
    "gcaActnInd",
    "rcvgBIC",
    "orgtgBIC",
    "cmpsitNotInSbcptFlg",
    "rltdCtdnMsgDtls"
})
public class CustodianDetailsSD1 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "CtdnCorpActnRcrdId", required = true)
    protected String ctdnCorpActnRcrdId;
    @XmlElement(name = "AgrInd", required = true)
    @XmlSchemaType(name = "string")
    protected CustodianRecordAgreementType1Code agrInd;
    @XmlElement(name = "CmpltnsInd", required = true)
    @XmlSchemaType(name = "string")
    protected CustodianRecordCompletenessType1Code cmpltnsInd;
    @XmlElement(name = "CtdnActnInd")
    @XmlSchemaType(name = "string")
    protected CustodianAction1Code ctdnActnInd;
    @XmlElement(name = "GCAActnInd")
    @XmlSchemaType(name = "string")
    protected GCAActionType1Code gcaActnInd;
    @XmlElement(name = "RcvgBIC", required = true)
    protected String rcvgBIC;
    @XmlElement(name = "OrgtgBIC", required = true)
    protected String orgtgBIC;
    @XmlElement(name = "CmpsitNotInSbcptFlg")
    protected boolean cmpsitNotInSbcptFlg;
    @XmlElement(name = "RltdCtdnMsgDtls")
    protected List<RelatedCustodianMessageDetailsSD1> rltdCtdnMsgDtls;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustodianDetailsSD1 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the ctdnCorpActnRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtdnCorpActnRcrdId() {
        return ctdnCorpActnRcrdId;
    }

    /**
     * Sets the value of the ctdnCorpActnRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustodianDetailsSD1 setCtdnCorpActnRcrdId(String value) {
        this.ctdnCorpActnRcrdId = value;
        return this;
    }

    /**
     * Gets the value of the agrInd property.
     * 
     * @return
     *     possible object is
     *     {@link CustodianRecordAgreementType1Code }
     *     
     */
    public CustodianRecordAgreementType1Code getAgrInd() {
        return agrInd;
    }

    /**
     * Sets the value of the agrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustodianRecordAgreementType1Code }
     *     
     */
    public CustodianDetailsSD1 setAgrInd(CustodianRecordAgreementType1Code value) {
        this.agrInd = value;
        return this;
    }

    /**
     * Gets the value of the cmpltnsInd property.
     * 
     * @return
     *     possible object is
     *     {@link CustodianRecordCompletenessType1Code }
     *     
     */
    public CustodianRecordCompletenessType1Code getCmpltnsInd() {
        return cmpltnsInd;
    }

    /**
     * Sets the value of the cmpltnsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustodianRecordCompletenessType1Code }
     *     
     */
    public CustodianDetailsSD1 setCmpltnsInd(CustodianRecordCompletenessType1Code value) {
        this.cmpltnsInd = value;
        return this;
    }

    /**
     * Gets the value of the ctdnActnInd property.
     * 
     * @return
     *     possible object is
     *     {@link CustodianAction1Code }
     *     
     */
    public CustodianAction1Code getCtdnActnInd() {
        return ctdnActnInd;
    }

    /**
     * Sets the value of the ctdnActnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustodianAction1Code }
     *     
     */
    public CustodianDetailsSD1 setCtdnActnInd(CustodianAction1Code value) {
        this.ctdnActnInd = value;
        return this;
    }

    /**
     * Gets the value of the gcaActnInd property.
     * 
     * @return
     *     possible object is
     *     {@link GCAActionType1Code }
     *     
     */
    public GCAActionType1Code getGCAActnInd() {
        return gcaActnInd;
    }

    /**
     * Sets the value of the gcaActnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCAActionType1Code }
     *     
     */
    public CustodianDetailsSD1 setGCAActnInd(GCAActionType1Code value) {
        this.gcaActnInd = value;
        return this;
    }

    /**
     * Gets the value of the rcvgBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvgBIC() {
        return rcvgBIC;
    }

    /**
     * Sets the value of the rcvgBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustodianDetailsSD1 setRcvgBIC(String value) {
        this.rcvgBIC = value;
        return this;
    }

    /**
     * Gets the value of the orgtgBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtgBIC() {
        return orgtgBIC;
    }

    /**
     * Sets the value of the orgtgBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustodianDetailsSD1 setOrgtgBIC(String value) {
        this.orgtgBIC = value;
        return this;
    }

    /**
     * Gets the value of the cmpsitNotInSbcptFlg property.
     * 
     */
    public boolean isCmpsitNotInSbcptFlg() {
        return cmpsitNotInSbcptFlg;
    }

    /**
     * Sets the value of the cmpsitNotInSbcptFlg property.
     * 
     */
    public CustodianDetailsSD1 setCmpsitNotInSbcptFlg(boolean value) {
        this.cmpsitNotInSbcptFlg = value;
        return this;
    }

    /**
     * Gets the value of the rltdCtdnMsgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdCtdnMsgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdCtdnMsgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedCustodianMessageDetailsSD1 }
     * 
     * 
     */
    public List<RelatedCustodianMessageDetailsSD1> getRltdCtdnMsgDtls() {
        if (rltdCtdnMsgDtls == null) {
            rltdCtdnMsgDtls = new ArrayList<RelatedCustodianMessageDetailsSD1>();
        }
        return this.rltdCtdnMsgDtls;
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
     * Adds a new item to the rltdCtdnMsgDtls list.
     * @see #getRltdCtdnMsgDtls()
     * 
     */
    public CustodianDetailsSD1 addRltdCtdnMsgDtls(RelatedCustodianMessageDetailsSD1 rltdCtdnMsgDtls) {
        getRltdCtdnMsgDtls().add(rltdCtdnMsgDtls);
        return this;
    }

}
