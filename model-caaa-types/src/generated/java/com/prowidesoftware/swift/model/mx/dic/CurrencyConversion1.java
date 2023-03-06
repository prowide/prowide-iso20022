
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider. The currency conversion has to be accepted by the cardholder.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyConversion1", propOrder = {
    "ccyConvsId",
    "rslt",
    "rspnRsn",
    "trgtCcy",
    "trgtCcyNmrc",
    "trgtCcyDcml",
    "trgtCcyNm",
    "rsltgAmt",
    "xchgRate",
    "nvrtdXchgRate",
    "qtnDt",
    "vldUntil",
    "srcCcy",
    "srcCcyNmrc",
    "srcCcyDcml",
    "srcCcyNm",
    "orgnlAmt",
    "comssnDtls",
    "mrkUpDtls",
    "dclrtnDtls"
})
public class CurrencyConversion1 {

    @XmlElement(name = "CcyConvsId")
    protected String ccyConvsId;
    @XmlElement(name = "Rslt", required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyConversionResponse1Code rslt;
    @XmlElement(name = "RspnRsn")
    protected String rspnRsn;
    @XmlElement(name = "TrgtCcy", required = true)
    protected String trgtCcy;
    @XmlElement(name = "TrgtCcyNmrc", required = true)
    protected String trgtCcyNmrc;
    @XmlElement(name = "TrgtCcyDcml", required = true)
    protected BigDecimal trgtCcyDcml;
    @XmlElement(name = "TrgtCcyNm")
    protected String trgtCcyNm;
    @XmlElement(name = "RsltgAmt", required = true)
    protected BigDecimal rsltgAmt;
    @XmlElement(name = "XchgRate", required = true)
    protected BigDecimal xchgRate;
    @XmlElement(name = "NvrtdXchgRate")
    protected BigDecimal nvrtdXchgRate;
    @XmlElement(name = "QtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar qtnDt;
    @XmlElement(name = "VldUntil", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vldUntil;
    @XmlElement(name = "SrcCcy", required = true)
    protected String srcCcy;
    @XmlElement(name = "SrcCcyNmrc")
    protected String srcCcyNmrc;
    @XmlElement(name = "SrcCcyDcml", required = true)
    protected BigDecimal srcCcyDcml;
    @XmlElement(name = "SrcCcyNm")
    protected String srcCcyNm;
    @XmlElement(name = "OrgnlAmt", required = true)
    protected BigDecimal orgnlAmt;
    @XmlElement(name = "ComssnDtls")
    protected List<Commission19> comssnDtls;
    @XmlElement(name = "MrkUpDtls")
    protected List<Commission18> mrkUpDtls;
    @XmlElement(name = "DclrtnDtls")
    protected String dclrtnDtls;

    /**
     * Gets the value of the ccyConvsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyConvsId() {
        return ccyConvsId;
    }

    /**
     * Sets the value of the ccyConvsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion1 setCcyConvsId(String value) {
        this.ccyConvsId = value;
        return this;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversionResponse1Code }
     *     
     */
    public CurrencyConversionResponse1Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversionResponse1Code }
     *     
     */
    public CurrencyConversion1 setRslt(CurrencyConversionResponse1Code value) {
        this.rslt = value;
        return this;
    }

    /**
     * Gets the value of the rspnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnRsn() {
        return rspnRsn;
    }

    /**
     * Sets the value of the rspnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion1 setRspnRsn(String value) {
        this.rspnRsn = value;
        return this;
    }

    /**
     * Gets the value of the trgtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgtCcy() {
        return trgtCcy;
    }

    /**
     * Sets the value of the trgtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion1 setTrgtCcy(String value) {
        this.trgtCcy = value;
        return this;
    }

    /**
     * Gets the value of the trgtCcyNmrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgtCcyNmrc() {
        return trgtCcyNmrc;
    }

    /**
     * Sets the value of the trgtCcyNmrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion1 setTrgtCcyNmrc(String value) {
        this.trgtCcyNmrc = value;
        return this;
    }

    /**
     * Gets the value of the trgtCcyDcml property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrgtCcyDcml() {
        return trgtCcyDcml;
    }

    /**
     * Sets the value of the trgtCcyDcml property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyConversion1 setTrgtCcyDcml(BigDecimal value) {
        this.trgtCcyDcml = value;
        return this;
    }

    /**
     * Gets the value of the trgtCcyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgtCcyNm() {
        return trgtCcyNm;
    }

    /**
     * Sets the value of the trgtCcyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion1 setTrgtCcyNm(String value) {
        this.trgtCcyNm = value;
        return this;
    }

    /**
     * Gets the value of the rsltgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRsltgAmt() {
        return rsltgAmt;
    }

    /**
     * Sets the value of the rsltgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyConversion1 setRsltgAmt(BigDecimal value) {
        this.rsltgAmt = value;
        return this;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyConversion1 setXchgRate(BigDecimal value) {
        this.xchgRate = value;
        return this;
    }

    /**
     * Gets the value of the nvrtdXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNvrtdXchgRate() {
        return nvrtdXchgRate;
    }

    /**
     * Sets the value of the nvrtdXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyConversion1 setNvrtdXchgRate(BigDecimal value) {
        this.nvrtdXchgRate = value;
        return this;
    }

    /**
     * Gets the value of the qtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getQtnDt() {
        return qtnDt;
    }

    /**
     * Sets the value of the qtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion1 setQtnDt(XMLGregorianCalendar value) {
        this.qtnDt = value;
        return this;
    }

    /**
     * Gets the value of the vldUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getVldUntil() {
        return vldUntil;
    }

    /**
     * Sets the value of the vldUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion1 setVldUntil(XMLGregorianCalendar value) {
        this.vldUntil = value;
        return this;
    }

    /**
     * Gets the value of the srcCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcCcy() {
        return srcCcy;
    }

    /**
     * Sets the value of the srcCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion1 setSrcCcy(String value) {
        this.srcCcy = value;
        return this;
    }

    /**
     * Gets the value of the srcCcyNmrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcCcyNmrc() {
        return srcCcyNmrc;
    }

    /**
     * Sets the value of the srcCcyNmrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion1 setSrcCcyNmrc(String value) {
        this.srcCcyNmrc = value;
        return this;
    }

    /**
     * Gets the value of the srcCcyDcml property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSrcCcyDcml() {
        return srcCcyDcml;
    }

    /**
     * Sets the value of the srcCcyDcml property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyConversion1 setSrcCcyDcml(BigDecimal value) {
        this.srcCcyDcml = value;
        return this;
    }

    /**
     * Gets the value of the srcCcyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcCcyNm() {
        return srcCcyNm;
    }

    /**
     * Sets the value of the srcCcyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion1 setSrcCcyNm(String value) {
        this.srcCcyNm = value;
        return this;
    }

    /**
     * Gets the value of the orgnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrgnlAmt() {
        return orgnlAmt;
    }

    /**
     * Sets the value of the orgnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyConversion1 setOrgnlAmt(BigDecimal value) {
        this.orgnlAmt = value;
        return this;
    }

    /**
     * Gets the value of the comssnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comssnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComssnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission19 }
     * 
     * 
     */
    public List<Commission19> getComssnDtls() {
        if (comssnDtls == null) {
            comssnDtls = new ArrayList<Commission19>();
        }
        return this.comssnDtls;
    }

    /**
     * Gets the value of the mrkUpDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mrkUpDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrkUpDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission18 }
     * 
     * 
     */
    public List<Commission18> getMrkUpDtls() {
        if (mrkUpDtls == null) {
            mrkUpDtls = new ArrayList<Commission18>();
        }
        return this.mrkUpDtls;
    }

    /**
     * Gets the value of the dclrtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDclrtnDtls() {
        return dclrtnDtls;
    }

    /**
     * Sets the value of the dclrtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion1 setDclrtnDtls(String value) {
        this.dclrtnDtls = value;
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
     * Adds a new item to the comssnDtls list.
     * @see #getComssnDtls()
     * 
     */
    public CurrencyConversion1 addComssnDtls(Commission19 comssnDtls) {
        getComssnDtls().add(comssnDtls);
        return this;
    }

    /**
     * Adds a new item to the mrkUpDtls list.
     * @see #getMrkUpDtls()
     * 
     */
    public CurrencyConversion1 addMrkUpDtls(Commission18 mrkUpDtls) {
        getMrkUpDtls().add(mrkUpDtls);
        return this;
    }

}
