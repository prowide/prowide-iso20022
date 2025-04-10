
package com.prowidesoftware.swift.model.mx.dic;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "Token3", propOrder = {
    "pmtTkn",
    "tknXpryDt",
    "tknRqstrId",
    "tknAssrncData",
    "tknAssrncMtd",
    "tknRefId",
    "tknInittdInd",
    "storgLctn",
    "othrStorgLctn",
    "prtcnMtd",
    "othrPrtcnMtd",
    "orgnlTkn",
    "addtlData"
})
public class Token3 {

    @XmlElement(name = "PmtTkn")
    protected String pmtTkn;
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
    protected StorageLocation1Code storgLctn;
    @XmlElement(name = "OthrStorgLctn")
    protected String othrStorgLctn;
    @XmlElement(name = "PrtcnMtd")
    @XmlSchemaType(name = "string")
    protected ProtectionMethod1Code prtcnMtd;
    @XmlElement(name = "OthrPrtcnMtd")
    protected String othrPrtcnMtd;
    @XmlElement(name = "OrgnlTkn")
    protected Token4 orgnlTkn;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

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
    public Token3 setPmtTkn(String value) {
        this.pmtTkn = value;
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
    public Token3 setTknXpryDt(YearMonth value) {
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
    public Token3 setTknRqstrId(String value) {
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
    public Token3 setTknAssrncData(String value) {
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
    public Token3 setTknAssrncMtd(String value) {
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
    public Token3 setTknRefId(String value) {
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
    public Token3 setTknInittdInd(Boolean value) {
        this.tknInittdInd = value;
        return this;
    }

    /**
     * Gets the value of the storgLctn property.
     * 
     * @return
     *     possible object is
     *     {@link StorageLocation1Code }
     *     
     */
    public StorageLocation1Code getStorgLctn() {
        return storgLctn;
    }

    /**
     * Sets the value of the storgLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageLocation1Code }
     *     
     */
    public Token3 setStorgLctn(StorageLocation1Code value) {
        this.storgLctn = value;
        return this;
    }

    /**
     * Gets the value of the othrStorgLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrStorgLctn() {
        return othrStorgLctn;
    }

    /**
     * Sets the value of the othrStorgLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Token3 setOthrStorgLctn(String value) {
        this.othrStorgLctn = value;
        return this;
    }

    /**
     * Gets the value of the prtcnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionMethod1Code }
     *     
     */
    public ProtectionMethod1Code getPrtcnMtd() {
        return prtcnMtd;
    }

    /**
     * Sets the value of the prtcnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionMethod1Code }
     *     
     */
    public Token3 setPrtcnMtd(ProtectionMethod1Code value) {
        this.prtcnMtd = value;
        return this;
    }

    /**
     * Gets the value of the othrPrtcnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPrtcnMtd() {
        return othrPrtcnMtd;
    }

    /**
     * Sets the value of the othrPrtcnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Token3 setOthrPrtcnMtd(String value) {
        this.othrPrtcnMtd = value;
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
    public Token3 setOrgnlTkn(Token4 value) {
        this.orgnlTkn = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
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
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Token3 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
