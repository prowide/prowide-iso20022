
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Provides information related to the collateral position, that is, the identification of the exposed party, the total exposure amount and the total collateral amount held by the taker. It also contains the valuation dates and the requested settlement date of collateral if there is a shortage of collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Summary1", propOrder = {
    "xpsdAmtPtyA",
    "xpsdAmtPtyB",
    "xpsrTp",
    "ttlValOfColl",
    "netXcssDfcit",
    "netXcssDfcitInd",
    "valtnDtTm",
    "reqdSttlmDt",
    "summryDtls"
})
public class Summary1 {

    @XmlElement(name = "XpsdAmtPtyA")
    protected ActiveCurrencyAndAmount xpsdAmtPtyA;
    @XmlElement(name = "XpsdAmtPtyB")
    protected ActiveCurrencyAndAmount xpsdAmtPtyB;
    @XmlElement(name = "XpsrTp", required = true)
    @XmlSchemaType(name = "string")
    protected ExposureType1Code xpsrTp;
    @XmlElement(name = "TtlValOfColl", required = true)
    protected ActiveCurrencyAndAmount ttlValOfColl;
    @XmlElement(name = "NetXcssDfcit")
    protected ActiveCurrencyAndAmount netXcssDfcit;
    @XmlElement(name = "NetXcssDfcitInd")
    @XmlSchemaType(name = "string")
    protected ShortLong1Code netXcssDfcitInd;
    @XmlElement(name = "ValtnDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar valtnDtTm;
    @XmlElement(name = "ReqdSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar reqdSttlmDt;
    @XmlElement(name = "SummryDtls")
    protected SummaryAmounts1 summryDtls;

    /**
     * Gets the value of the xpsdAmtPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getXpsdAmtPtyA() {
        return xpsdAmtPtyA;
    }

    /**
     * Sets the value of the xpsdAmtPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Summary1 setXpsdAmtPtyA(ActiveCurrencyAndAmount value) {
        this.xpsdAmtPtyA = value;
        return this;
    }

    /**
     * Gets the value of the xpsdAmtPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getXpsdAmtPtyB() {
        return xpsdAmtPtyB;
    }

    /**
     * Sets the value of the xpsdAmtPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Summary1 setXpsdAmtPtyB(ActiveCurrencyAndAmount value) {
        this.xpsdAmtPtyB = value;
        return this;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType1Code }
     *     
     */
    public ExposureType1Code getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType1Code }
     *     
     */
    public Summary1 setXpsrTp(ExposureType1Code value) {
        this.xpsrTp = value;
        return this;
    }

    /**
     * Gets the value of the ttlValOfColl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlValOfColl() {
        return ttlValOfColl;
    }

    /**
     * Sets the value of the ttlValOfColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Summary1 setTtlValOfColl(ActiveCurrencyAndAmount value) {
        this.ttlValOfColl = value;
        return this;
    }

    /**
     * Gets the value of the netXcssDfcit property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetXcssDfcit() {
        return netXcssDfcit;
    }

    /**
     * Sets the value of the netXcssDfcit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Summary1 setNetXcssDfcit(ActiveCurrencyAndAmount value) {
        this.netXcssDfcit = value;
        return this;
    }

    /**
     * Gets the value of the netXcssDfcitInd property.
     * 
     * @return
     *     possible object is
     *     {@link ShortLong1Code }
     *     
     */
    public ShortLong1Code getNetXcssDfcitInd() {
        return netXcssDfcitInd;
    }

    /**
     * Sets the value of the netXcssDfcitInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortLong1Code }
     *     
     */
    public Summary1 setNetXcssDfcitInd(ShortLong1Code value) {
        this.netXcssDfcitInd = value;
        return this;
    }

    /**
     * Gets the value of the valtnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getValtnDtTm() {
        return valtnDtTm;
    }

    /**
     * Sets the value of the valtnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Summary1 setValtnDtTm(Calendar value) {
        this.valtnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the reqdSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getReqdSttlmDt() {
        return reqdSttlmDt;
    }

    /**
     * Sets the value of the reqdSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Summary1 setReqdSttlmDt(Calendar value) {
        this.reqdSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the summryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryAmounts1 }
     *     
     */
    public SummaryAmounts1 getSummryDtls() {
        return summryDtls;
    }

    /**
     * Sets the value of the summryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryAmounts1 }
     *     
     */
    public Summary1 setSummryDtls(SummaryAmounts1 value) {
        this.summryDtls = value;
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
