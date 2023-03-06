
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * List of elements which provide the parameters of an option trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Option10", propOrder = {
    "data",
    "exrcSts",
    "exrcStyle",
    "optnTp",
    "derivOptnId",
    "optnPyoutTp",
    "valtnRate",
    "strkPric",
    "voltlyMrgn",
    "rskAmt",
    "xpryDtAndTm",
    "xpryLctn",
    "sttlmTp",
    "optnAmts",
    "prm",
    "sttlmAmtTp",
    "addtlOptnInf"
})
public class Option10 {

    @XmlElement(name = "Data", required = true)
    @XmlSchemaType(name = "string")
    protected DataType1Code data;
    @XmlElement(name = "ExrcSts", required = true)
    @XmlSchemaType(name = "string")
    protected DerivativeExerciseStatus1Code exrcSts;
    @XmlElement(name = "ExrcStyle", required = true)
    @XmlSchemaType(name = "string")
    protected OptionStyle2Code exrcStyle;
    @XmlElement(name = "OptnTp", required = true)
    @XmlSchemaType(name = "string")
    protected OptionType1Code optnTp;
    @XmlElement(name = "DerivOptnId", required = true)
    protected String derivOptnId;
    @XmlElement(name = "OptnPyoutTp", required = true)
    @XmlSchemaType(name = "string")
    protected OptionPayoutType1Code optnPyoutTp;
    @XmlElement(name = "ValtnRate", required = true)
    protected AgreedRate3 valtnRate;
    @XmlElement(name = "StrkPric", required = true)
    protected AgreedRate3 strkPric;
    @XmlElement(name = "VoltlyMrgn", required = true)
    protected BigDecimal voltlyMrgn;
    @XmlElement(name = "RskAmt", required = true)
    protected ActiveCurrencyAndAmount rskAmt;
    @XmlElement(name = "XpryDtAndTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xpryDtAndTm;
    @XmlElement(name = "XpryLctn", required = true)
    protected String xpryLctn;
    @XmlElement(name = "SttlmTp", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementDateCode sttlmTp;
    @XmlElement(name = "OptnAmts", required = true)
    protected AmountsAndValueDate4 optnAmts;
    @XmlElement(name = "Prm", required = true)
    protected PremiumAmount3 prm;
    @XmlElement(name = "SttlmAmtTp", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementType1Code sttlmAmtTp;
    @XmlElement(name = "AddtlOptnInf", required = true)
    protected String addtlOptnInf;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link DataType1Code }
     *     
     */
    public DataType1Code getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType1Code }
     *     
     */
    public Option10 setData(DataType1Code value) {
        this.data = value;
        return this;
    }

    /**
     * Gets the value of the exrcSts property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeExerciseStatus1Code }
     *     
     */
    public DerivativeExerciseStatus1Code getExrcSts() {
        return exrcSts;
    }

    /**
     * Sets the value of the exrcSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeExerciseStatus1Code }
     *     
     */
    public Option10 setExrcSts(DerivativeExerciseStatus1Code value) {
        this.exrcSts = value;
        return this;
    }

    /**
     * Gets the value of the exrcStyle property.
     * 
     * @return
     *     possible object is
     *     {@link OptionStyle2Code }
     *     
     */
    public OptionStyle2Code getExrcStyle() {
        return exrcStyle;
    }

    /**
     * Sets the value of the exrcStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStyle2Code }
     *     
     */
    public Option10 setExrcStyle(OptionStyle2Code value) {
        this.exrcStyle = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType1Code }
     *     
     */
    public OptionType1Code getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType1Code }
     *     
     */
    public Option10 setOptnTp(OptionType1Code value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the derivOptnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivOptnId() {
        return derivOptnId;
    }

    /**
     * Sets the value of the derivOptnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Option10 setDerivOptnId(String value) {
        this.derivOptnId = value;
        return this;
    }

    /**
     * Gets the value of the optnPyoutTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionPayoutType1Code }
     *     
     */
    public OptionPayoutType1Code getOptnPyoutTp() {
        return optnPyoutTp;
    }

    /**
     * Sets the value of the optnPyoutTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionPayoutType1Code }
     *     
     */
    public Option10 setOptnPyoutTp(OptionPayoutType1Code value) {
        this.optnPyoutTp = value;
        return this;
    }

    /**
     * Gets the value of the valtnRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate3 }
     *     
     */
    public AgreedRate3 getValtnRate() {
        return valtnRate;
    }

    /**
     * Sets the value of the valtnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate3 }
     *     
     */
    public Option10 setValtnRate(AgreedRate3 value) {
        this.valtnRate = value;
        return this;
    }

    /**
     * Gets the value of the strkPric property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate3 }
     *     
     */
    public AgreedRate3 getStrkPric() {
        return strkPric;
    }

    /**
     * Sets the value of the strkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate3 }
     *     
     */
    public Option10 setStrkPric(AgreedRate3 value) {
        this.strkPric = value;
        return this;
    }

    /**
     * Gets the value of the voltlyMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVoltlyMrgn() {
        return voltlyMrgn;
    }

    /**
     * Sets the value of the voltlyMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Option10 setVoltlyMrgn(BigDecimal value) {
        this.voltlyMrgn = value;
        return this;
    }

    /**
     * Gets the value of the rskAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRskAmt() {
        return rskAmt;
    }

    /**
     * Sets the value of the rskAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Option10 setRskAmt(ActiveCurrencyAndAmount value) {
        this.rskAmt = value;
        return this;
    }

    /**
     * Gets the value of the xpryDtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getXpryDtAndTm() {
        return xpryDtAndTm;
    }

    /**
     * Sets the value of the xpryDtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Option10 setXpryDtAndTm(XMLGregorianCalendar value) {
        this.xpryDtAndTm = value;
        return this;
    }

    /**
     * Gets the value of the xpryLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpryLctn() {
        return xpryLctn;
    }

    /**
     * Sets the value of the xpryLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Option10 setXpryLctn(String value) {
        this.xpryLctn = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDateCode }
     *     
     */
    public SettlementDateCode getSttlmTp() {
        return sttlmTp;
    }

    /**
     * Sets the value of the sttlmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDateCode }
     *     
     */
    public Option10 setSttlmTp(SettlementDateCode value) {
        this.sttlmTp = value;
        return this;
    }

    /**
     * Gets the value of the optnAmts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountsAndValueDate4 }
     *     
     */
    public AmountsAndValueDate4 getOptnAmts() {
        return optnAmts;
    }

    /**
     * Sets the value of the optnAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountsAndValueDate4 }
     *     
     */
    public Option10 setOptnAmts(AmountsAndValueDate4 value) {
        this.optnAmts = value;
        return this;
    }

    /**
     * Gets the value of the prm property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumAmount3 }
     *     
     */
    public PremiumAmount3 getPrm() {
        return prm;
    }

    /**
     * Sets the value of the prm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumAmount3 }
     *     
     */
    public Option10 setPrm(PremiumAmount3 value) {
        this.prm = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementType1Code }
     *     
     */
    public SettlementType1Code getSttlmAmtTp() {
        return sttlmAmtTp;
    }

    /**
     * Sets the value of the sttlmAmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementType1Code }
     *     
     */
    public Option10 setSttlmAmtTp(SettlementType1Code value) {
        this.sttlmAmtTp = value;
        return this;
    }

    /**
     * Gets the value of the addtlOptnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlOptnInf() {
        return addtlOptnInf;
    }

    /**
     * Sets the value of the addtlOptnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Option10 setAddtlOptnInf(String value) {
        this.addtlOptnInf = value;
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
