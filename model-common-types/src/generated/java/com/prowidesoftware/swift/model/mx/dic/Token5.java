
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoYearMonthAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Unencrypted sensitive data of a token.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Token5", propOrder = {
    "pmtTkn",
    "tknTp",
    "tknXpryDt",
    "tknRqstrId",
    "tknAssrncData",
    "tknAssrncMtd",
    "tknRefId",
    "tknInittdInd",
    "storgLctn",
    "prtcnMtd",
    "nonPmt",
    "tknRqstrNm",
    "updtdChanl",
    "sts",
    "tknActvtnDtTm",
    "orgnlTkn",
    "prvtData",
    "ntlData"
})
public class Token5 {

    @XmlElement(name = "PmtTkn")
    protected String pmtTkn;
    @XmlElement(name = "TknTp")
    protected String tknTp;
    @XmlElement(name = "TknXpryDt", type = String.class)
    @XmlJavaTypeAdapter(IsoYearMonthAdapter.class)
    @XmlSchemaType(name = "gYearMonth")
    protected YearMonth tknXpryDt;
    @XmlElement(name = "TknRqstrId")
    protected String tknRqstrId;
    @XmlElement(name = "TknAssrncData")
    protected String tknAssrncData;
    @XmlElement(name = "TknAssrncMtd")
    protected String tknAssrncMtd;
    @XmlElement(name = "TknRefId")
    protected String tknRefId;
    @XmlElement(name = "TknInittdInd")
    protected Boolean tknInittdInd;
    @XmlElement(name = "StorgLctn")
    @XmlSchemaType(name = "string")
    protected StorageLocation2Code storgLctn;
    @XmlElement(name = "PrtcnMtd")
    @XmlSchemaType(name = "string")
    protected ProtectionMethod2Code prtcnMtd;
    @XmlElement(name = "NonPmt")
    protected Boolean nonPmt;
    @XmlElement(name = "TknRqstrNm")
    protected String tknRqstrNm;
    @XmlElement(name = "UpdtdChanl")
    protected String updtdChanl;
    @XmlElement(name = "Sts")
    protected String sts;
    @XmlElement(name = "TknActvtnDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime tknActvtnDtTm;
    @XmlElement(name = "OrgnlTkn")
    protected Token4 orgnlTkn;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

    /**
     * Gets the value of the pmtTkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtTkn() {
        return pmtTkn;
    }

    /**
     * Sets the value of the pmtTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Token5 setPmtTkn(String value) {
        this.pmtTkn = value;
        return this;
    }

    /**
     * Gets the value of the tknTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknTp() {
        return tknTp;
    }

    /**
     * Sets the value of the tknTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Token5 setTknTp(String value) {
        this.tknTp = value;
        return this;
    }

    /**
     * Gets the value of the tknXpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public YearMonth getTknXpryDt() {
        return tknXpryDt;
    }

    /**
     * Sets the value of the tknXpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Token5 setTknXpryDt(YearMonth value) {
        this.tknXpryDt = value;
        return this;
    }

    /**
     * Gets the value of the tknRqstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknRqstrId() {
        return tknRqstrId;
    }

    /**
     * Sets the value of the tknRqstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Token5 setTknRqstrId(String value) {
        this.tknRqstrId = value;
        return this;
    }

    /**
     * Gets the value of the tknAssrncData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknAssrncData() {
        return tknAssrncData;
    }

    /**
     * Sets the value of the tknAssrncData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Token5 setTknAssrncData(String value) {
        this.tknAssrncData = value;
        return this;
    }

    /**
     * Gets the value of the tknAssrncMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknAssrncMtd() {
        return tknAssrncMtd;
    }

    /**
     * Sets the value of the tknAssrncMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Token5 setTknAssrncMtd(String value) {
        this.tknAssrncMtd = value;
        return this;
    }

    /**
     * Gets the value of the tknRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknRefId() {
        return tknRefId;
    }

    /**
     * Sets the value of the tknRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Token5 setTknRefId(String value) {
        this.tknRefId = value;
        return this;
    }

    /**
     * Gets the value of the tknInittdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTknInittdInd() {
        return tknInittdInd;
    }

    /**
     * Sets the value of the tknInittdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Token5 setTknInittdInd(Boolean value) {
        this.tknInittdInd = value;
        return this;
    }

    /**
     * Gets the value of the storgLctn property.
     * 
     * @return
     *     possible object is
     *     {@link StorageLocation2Code }
     *     
     */
    public StorageLocation2Code getStorgLctn() {
        return storgLctn;
    }

    /**
     * Sets the value of the storgLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageLocation2Code }
     *     
     */
    public Token5 setStorgLctn(StorageLocation2Code value) {
        this.storgLctn = value;
        return this;
    }

    /**
     * Gets the value of the prtcnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionMethod2Code }
     *     
     */
    public ProtectionMethod2Code getPrtcnMtd() {
        return prtcnMtd;
    }

    /**
     * Sets the value of the prtcnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionMethod2Code }
     *     
     */
    public Token5 setPrtcnMtd(ProtectionMethod2Code value) {
        this.prtcnMtd = value;
        return this;
    }

    /**
     * Gets the value of the nonPmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonPmt() {
        return nonPmt;
    }

    /**
     * Sets the value of the nonPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Token5 setNonPmt(Boolean value) {
        this.nonPmt = value;
        return this;
    }

    /**
     * Gets the value of the tknRqstrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknRqstrNm() {
        return tknRqstrNm;
    }

    /**
     * Sets the value of the tknRqstrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Token5 setTknRqstrNm(String value) {
        this.tknRqstrNm = value;
        return this;
    }

    /**
     * Gets the value of the updtdChanl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdtdChanl() {
        return updtdChanl;
    }

    /**
     * Sets the value of the updtdChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Token5 setUpdtdChanl(String value) {
        this.updtdChanl = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Token5 setSts(String value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the tknActvtnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getTknActvtnDtTm() {
        return tknActvtnDtTm;
    }

    /**
     * Sets the value of the tknActvtnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Token5 setTknActvtnDtTm(OffsetDateTime value) {
        this.tknActvtnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the orgnlTkn property.
     * 
     * @return
     *     possible object is
     *     {@link Token4 }
     *     
     */
    public Token4 getOrgnlTkn() {
        return orgnlTkn;
    }

    /**
     * Sets the value of the orgnlTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token4 }
     *     
     */
    public Token5 setOrgnlTkn(Token4 value) {
        this.orgnlTkn = value;
        return this;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
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
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public Token5 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public Token5 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
