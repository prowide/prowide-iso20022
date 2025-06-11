
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Message in file message identified as a batch record.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Record3", propOrder = {
    "seqCntr",
    "rcrdChcksmInptVal",
    "orgtrId",
    "orgtrAssgnr",
    "orgtrCtry",
    "orgtrShrtNm",
    "dstnId",
    "dstnAssgnr",
    "dstnCtry",
    "dstnShrtNm",
    "clrMtd",
    "othrClrMtd",
    "clrPrty",
    "clrDt",
    "clrAmt",
    "clrCcy",
    "clrCdtDbt",
    "intrchngFeeAmt",
    "intrchngFeeCcy",
    "intrchngFeeCdtDbt",
    "agtFeeAmt",
    "agtFeeCcy",
    "agtFeeCdtDbt",
    "othrAmt",
    "rcrdMsg"
})
public class Record3 {

    @XmlElement(name = "SeqCntr", required = true)
    protected BigDecimal seqCntr;
    @XmlElement(name = "RcrdChcksmInptVal")
    protected byte[] rcrdChcksmInptVal;
    @XmlElement(name = "OrgtrId")
    protected String orgtrId;
    @XmlElement(name = "OrgtrAssgnr")
    protected String orgtrAssgnr;
    @XmlElement(name = "OrgtrCtry")
    protected String orgtrCtry;
    @XmlElement(name = "OrgtrShrtNm")
    protected String orgtrShrtNm;
    @XmlElement(name = "DstnId")
    protected String dstnId;
    @XmlElement(name = "DstnAssgnr")
    protected String dstnAssgnr;
    @XmlElement(name = "DstnCtry")
    protected String dstnCtry;
    @XmlElement(name = "DstnShrtNm")
    protected String dstnShrtNm;
    @XmlElement(name = "ClrMtd", required = true)
    @XmlSchemaType(name = "string")
    protected ClearingMethod2Code clrMtd;
    @XmlElement(name = "OthrClrMtd")
    protected String othrClrMtd;
    @XmlElement(name = "ClrPrty")
    protected String clrPrty;
    @XmlElement(name = "ClrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clrDt;
    @XmlElement(name = "ClrAmt")
    protected BigDecimal clrAmt;
    @XmlElement(name = "ClrCcy")
    protected String clrCcy;
    @XmlElement(name = "ClrCdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code clrCdtDbt;
    @XmlElement(name = "IntrchngFeeAmt")
    protected BigDecimal intrchngFeeAmt;
    @XmlElement(name = "IntrchngFeeCcy")
    protected String intrchngFeeCcy;
    @XmlElement(name = "IntrchngFeeCdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code intrchngFeeCdtDbt;
    @XmlElement(name = "AgtFeeAmt")
    protected BigDecimal agtFeeAmt;
    @XmlElement(name = "AgtFeeCcy")
    protected String agtFeeCcy;
    @XmlElement(name = "AgtFeeCdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code agtFeeCdtDbt;
    @XmlElement(name = "OthrAmt")
    protected OtherAmount5 othrAmt;
    @XmlElement(name = "RcrdMsg", required = true)
    protected RecordMessage1Choice rcrdMsg;

    /**
     * Gets the value of the seqCntr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqCntr() {
        return seqCntr;
    }

    /**
     * Sets the value of the seqCntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Record3 setSeqCntr(BigDecimal value) {
        this.seqCntr = value;
        return this;
    }

    /**
     * Gets the value of the rcrdChcksmInptVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRcrdChcksmInptVal() {
        return rcrdChcksmInptVal;
    }

    /**
     * Sets the value of the rcrdChcksmInptVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public Record3 setRcrdChcksmInptVal(byte[] value) {
        this.rcrdChcksmInptVal = value;
        return this;
    }

    /**
     * Gets the value of the orgtrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtrId() {
        return orgtrId;
    }

    /**
     * Sets the value of the orgtrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Record3 setOrgtrId(String value) {
        this.orgtrId = value;
        return this;
    }

    /**
     * Gets the value of the orgtrAssgnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtrAssgnr() {
        return orgtrAssgnr;
    }

    /**
     * Sets the value of the orgtrAssgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Record3 setOrgtrAssgnr(String value) {
        this.orgtrAssgnr = value;
        return this;
    }

    /**
     * Gets the value of the orgtrCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtrCtry() {
        return orgtrCtry;
    }

    /**
     * Sets the value of the orgtrCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Record3 setOrgtrCtry(String value) {
        this.orgtrCtry = value;
        return this;
    }

    /**
     * Gets the value of the orgtrShrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtrShrtNm() {
        return orgtrShrtNm;
    }

    /**
     * Sets the value of the orgtrShrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Record3 setOrgtrShrtNm(String value) {
        this.orgtrShrtNm = value;
        return this;
    }

    /**
     * Gets the value of the dstnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstnId() {
        return dstnId;
    }

    /**
     * Sets the value of the dstnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Record3 setDstnId(String value) {
        this.dstnId = value;
        return this;
    }

    /**
     * Gets the value of the dstnAssgnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstnAssgnr() {
        return dstnAssgnr;
    }

    /**
     * Sets the value of the dstnAssgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Record3 setDstnAssgnr(String value) {
        this.dstnAssgnr = value;
        return this;
    }

    /**
     * Gets the value of the dstnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstnCtry() {
        return dstnCtry;
    }

    /**
     * Sets the value of the dstnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Record3 setDstnCtry(String value) {
        this.dstnCtry = value;
        return this;
    }

    /**
     * Gets the value of the dstnShrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstnShrtNm() {
        return dstnShrtNm;
    }

    /**
     * Sets the value of the dstnShrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Record3 setDstnShrtNm(String value) {
        this.dstnShrtNm = value;
        return this;
    }

    /**
     * Gets the value of the clrMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingMethod2Code }
     *     
     */
    public ClearingMethod2Code getClrMtd() {
        return clrMtd;
    }

    /**
     * Sets the value of the clrMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingMethod2Code }
     *     
     */
    public Record3 setClrMtd(ClearingMethod2Code value) {
        this.clrMtd = value;
        return this;
    }

    /**
     * Gets the value of the othrClrMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrClrMtd() {
        return othrClrMtd;
    }

    /**
     * Sets the value of the othrClrMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Record3 setOthrClrMtd(String value) {
        this.othrClrMtd = value;
        return this;
    }

    /**
     * Gets the value of the clrPrty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrPrty() {
        return clrPrty;
    }

    /**
     * Sets the value of the clrPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Record3 setClrPrty(String value) {
        this.clrPrty = value;
        return this;
    }

    /**
     * Gets the value of the clrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getClrDt() {
        return clrDt;
    }

    /**
     * Sets the value of the clrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Record3 setClrDt(XMLGregorianCalendar value) {
        this.clrDt = value;
        return this;
    }

    /**
     * Gets the value of the clrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClrAmt() {
        return clrAmt;
    }

    /**
     * Sets the value of the clrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Record3 setClrAmt(BigDecimal value) {
        this.clrAmt = value;
        return this;
    }

    /**
     * Gets the value of the clrCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrCcy() {
        return clrCcy;
    }

    /**
     * Sets the value of the clrCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Record3 setClrCcy(String value) {
        this.clrCcy = value;
        return this;
    }

    /**
     * Gets the value of the clrCdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getClrCdtDbt() {
        return clrCdtDbt;
    }

    /**
     * Sets the value of the clrCdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public Record3 setClrCdtDbt(CreditDebit3Code value) {
        this.clrCdtDbt = value;
        return this;
    }

    /**
     * Gets the value of the intrchngFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrchngFeeAmt() {
        return intrchngFeeAmt;
    }

    /**
     * Sets the value of the intrchngFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Record3 setIntrchngFeeAmt(BigDecimal value) {
        this.intrchngFeeAmt = value;
        return this;
    }

    /**
     * Gets the value of the intrchngFeeCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrchngFeeCcy() {
        return intrchngFeeCcy;
    }

    /**
     * Sets the value of the intrchngFeeCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Record3 setIntrchngFeeCcy(String value) {
        this.intrchngFeeCcy = value;
        return this;
    }

    /**
     * Gets the value of the intrchngFeeCdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getIntrchngFeeCdtDbt() {
        return intrchngFeeCdtDbt;
    }

    /**
     * Sets the value of the intrchngFeeCdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public Record3 setIntrchngFeeCdtDbt(CreditDebit3Code value) {
        this.intrchngFeeCdtDbt = value;
        return this;
    }

    /**
     * Gets the value of the agtFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgtFeeAmt() {
        return agtFeeAmt;
    }

    /**
     * Sets the value of the agtFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Record3 setAgtFeeAmt(BigDecimal value) {
        this.agtFeeAmt = value;
        return this;
    }

    /**
     * Gets the value of the agtFeeCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgtFeeCcy() {
        return agtFeeCcy;
    }

    /**
     * Sets the value of the agtFeeCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Record3 setAgtFeeCcy(String value) {
        this.agtFeeCcy = value;
        return this;
    }

    /**
     * Gets the value of the agtFeeCdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getAgtFeeCdtDbt() {
        return agtFeeCdtDbt;
    }

    /**
     * Sets the value of the agtFeeCdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public Record3 setAgtFeeCdtDbt(CreditDebit3Code value) {
        this.agtFeeCdtDbt = value;
        return this;
    }

    /**
     * Gets the value of the othrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmount5 }
     *     
     */
    public OtherAmount5 getOthrAmt() {
        return othrAmt;
    }

    /**
     * Sets the value of the othrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmount5 }
     *     
     */
    public Record3 setOthrAmt(OtherAmount5 value) {
        this.othrAmt = value;
        return this;
    }

    /**
     * Gets the value of the rcrdMsg property.
     * 
     * @return
     *     possible object is
     *     {@link RecordMessage1Choice }
     *     
     */
    public RecordMessage1Choice getRcrdMsg() {
        return rcrdMsg;
    }

    /**
     * Sets the value of the rcrdMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordMessage1Choice }
     *     
     */
    public Record3 setRcrdMsg(RecordMessage1Choice value) {
        this.rcrdMsg = value;
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
