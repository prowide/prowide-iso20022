
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information on the status of a trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeData1", propOrder = {
    "ntfctnId",
    "mtchgSysUnqRef",
    "stsOrgtr",
    "curSts",
    "xtndedCurSts",
    "curStsSubTp",
    "curStsTm",
    "prvsSts",
    "xtndedPrvsSts",
    "prvsStsSubTp",
    "prvsStsTm",
    "pdctTp"
})
public class TradeData1 {

    @XmlElement(name = "NtfctnId", required = true)
    protected String ntfctnId;
    @XmlElement(name = "MtchgSysUnqRef", required = true)
    protected String mtchgSysUnqRef;
    @XmlElement(name = "StsOrgtr")
    protected String stsOrgtr;
    @XmlElement(name = "CurSts")
    @XmlSchemaType(name = "string")
    protected TradeStatus1Code curSts;
    @XmlElement(name = "XtndedCurSts")
    protected String xtndedCurSts;
    @XmlElement(name = "CurStsSubTp")
    protected String curStsSubTp;
    @XmlElement(name = "CurStsTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar curStsTm;
    @XmlElement(name = "PrvsSts")
    @XmlSchemaType(name = "string")
    protected TradeStatus1Code prvsSts;
    @XmlElement(name = "XtndedPrvsSts")
    protected String xtndedPrvsSts;
    @XmlElement(name = "PrvsStsSubTp")
    protected String prvsStsSubTp;
    @XmlElement(name = "PrvsStsTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prvsStsTm;
    @XmlElement(name = "PdctTp")
    protected String pdctTp;

    /**
     * Gets the value of the ntfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtfctnId() {
        return ntfctnId;
    }

    /**
     * Sets the value of the ntfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData1 setNtfctnId(String value) {
        this.ntfctnId = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSysUnqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchgSysUnqRef() {
        return mtchgSysUnqRef;
    }

    /**
     * Sets the value of the mtchgSysUnqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData1 setMtchgSysUnqRef(String value) {
        this.mtchgSysUnqRef = value;
        return this;
    }

    /**
     * Gets the value of the stsOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsOrgtr() {
        return stsOrgtr;
    }

    /**
     * Sets the value of the stsOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData1 setStsOrgtr(String value) {
        this.stsOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the curSts property.
     * 
     * @return
     *     possible object is
     *     {@link TradeStatus1Code }
     *     
     */
    public TradeStatus1Code getCurSts() {
        return curSts;
    }

    /**
     * Sets the value of the curSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeStatus1Code }
     *     
     */
    public TradeData1 setCurSts(TradeStatus1Code value) {
        this.curSts = value;
        return this;
    }

    /**
     * Gets the value of the xtndedCurSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedCurSts() {
        return xtndedCurSts;
    }

    /**
     * Sets the value of the xtndedCurSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData1 setXtndedCurSts(String value) {
        this.xtndedCurSts = value;
        return this;
    }

    /**
     * Gets the value of the curStsSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurStsSubTp() {
        return curStsSubTp;
    }

    /**
     * Sets the value of the curStsSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData1 setCurStsSubTp(String value) {
        this.curStsSubTp = value;
        return this;
    }

    /**
     * Gets the value of the curStsTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getCurStsTm() {
        return curStsTm;
    }

    /**
     * Sets the value of the curStsTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData1 setCurStsTm(XMLGregorianCalendar value) {
        this.curStsTm = value;
        return this;
    }

    /**
     * Gets the value of the prvsSts property.
     * 
     * @return
     *     possible object is
     *     {@link TradeStatus1Code }
     *     
     */
    public TradeStatus1Code getPrvsSts() {
        return prvsSts;
    }

    /**
     * Sets the value of the prvsSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeStatus1Code }
     *     
     */
    public TradeData1 setPrvsSts(TradeStatus1Code value) {
        this.prvsSts = value;
        return this;
    }

    /**
     * Gets the value of the xtndedPrvsSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedPrvsSts() {
        return xtndedPrvsSts;
    }

    /**
     * Sets the value of the xtndedPrvsSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData1 setXtndedPrvsSts(String value) {
        this.xtndedPrvsSts = value;
        return this;
    }

    /**
     * Gets the value of the prvsStsSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvsStsSubTp() {
        return prvsStsSubTp;
    }

    /**
     * Sets the value of the prvsStsSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData1 setPrvsStsSubTp(String value) {
        this.prvsStsSubTp = value;
        return this;
    }

    /**
     * Gets the value of the prvsStsTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getPrvsStsTm() {
        return prvsStsTm;
    }

    /**
     * Sets the value of the prvsStsTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData1 setPrvsStsTm(XMLGregorianCalendar value) {
        this.prvsStsTm = value;
        return this;
    }

    /**
     * Gets the value of the pdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctTp() {
        return pdctTp;
    }

    /**
     * Sets the value of the pdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData1 setPdctTp(String value) {
        this.pdctTp = value;
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

}
