
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * Instruction from an investor to sell investment fund units back to the fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedemptionBulkOrder3", propOrder = {
    "mstrRef",
    "plcOfTrad",
    "ordrDtTm",
    "xpryDtTm",
    "reqdFutrTradDt",
    "cxlRght",
    "xtndedCxlRght",
    "finInstrmDtls",
    "indvOrdrDtls",
    "reqdSttlmCcy",
    "reqdNAVCcy",
    "ttlSttlmAmt",
    "cshSttlmDt",
    "blkCshSttlmDtls"
})
public class RedemptionBulkOrder3 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification1Choice plcOfTrad;
    @XmlElement(name = "OrdrDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime ordrDtTm;
    @XmlElement(name = "XpryDtTm")
    protected DateAndDateTimeChoice xpryDtTm;
    @XmlElement(name = "ReqdFutrTradDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate reqdFutrTradDt;
    @XmlElement(name = "CxlRght")
    @XmlSchemaType(name = "string")
    protected CancellationRight1Code cxlRght;
    @XmlElement(name = "XtndedCxlRght")
    protected String xtndedCxlRght;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument10 finInstrmDtls;
    @XmlElement(name = "IndvOrdrDtls", required = true)
    protected List<RedemptionOrder5> indvOrdrDtls;
    @XmlElement(name = "ReqdSttlmCcy")
    protected String reqdSttlmCcy;
    @XmlElement(name = "ReqdNAVCcy")
    protected String reqdNAVCcy;
    @XmlElement(name = "TtlSttlmAmt")
    protected ActiveCurrencyAndAmount ttlSttlmAmt;
    @XmlElement(name = "CshSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate cshSttlmDt;
    @XmlElement(name = "BlkCshSttlmDtls")
    protected PaymentTransaction21 blkCshSttlmDtls;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionBulkOrder3 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfTradeIdentification1Choice }
     *     
     */
    public PlaceOfTradeIdentification1Choice getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfTradeIdentification1Choice }
     *     
     */
    public RedemptionBulkOrder3 setPlcOfTrad(PlaceOfTradeIdentification1Choice value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the ordrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getOrdrDtTm() {
        return ordrDtTm;
    }

    /**
     * Sets the value of the ordrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionBulkOrder3 setOrdrDtTm(OffsetDateTime value) {
        this.ordrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the xpryDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getXpryDtTm() {
        return xpryDtTm;
    }

    /**
     * Sets the value of the xpryDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public RedemptionBulkOrder3 setXpryDtTm(DateAndDateTimeChoice value) {
        this.xpryDtTm = value;
        return this;
    }

    /**
     * Gets the value of the reqdFutrTradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getReqdFutrTradDt() {
        return reqdFutrTradDt;
    }

    /**
     * Sets the value of the reqdFutrTradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionBulkOrder3 setReqdFutrTradDt(LocalDate value) {
        this.reqdFutrTradDt = value;
        return this;
    }

    /**
     * Gets the value of the cxlRght property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationRight1Code }
     *     
     */
    public CancellationRight1Code getCxlRght() {
        return cxlRght;
    }

    /**
     * Sets the value of the cxlRght property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationRight1Code }
     *     
     */
    public RedemptionBulkOrder3 setCxlRght(CancellationRight1Code value) {
        this.cxlRght = value;
        return this;
    }

    /**
     * Gets the value of the xtndedCxlRght property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedCxlRght() {
        return xtndedCxlRght;
    }

    /**
     * Sets the value of the xtndedCxlRght property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionBulkOrder3 setXtndedCxlRght(String value) {
        this.xtndedCxlRght = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument10 }
     *     
     */
    public FinancialInstrument10 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument10 }
     *     
     */
    public RedemptionBulkOrder3 setFinInstrmDtls(FinancialInstrument10 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the indvOrdrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvOrdrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvOrdrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RedemptionOrder5 }
     * 
     * 
     * @return
     *     The value of the indvOrdrDtls property.
     */
    public List<RedemptionOrder5> getIndvOrdrDtls() {
        if (indvOrdrDtls == null) {
            indvOrdrDtls = new ArrayList<>();
        }
        return this.indvOrdrDtls;
    }

    /**
     * Gets the value of the reqdSttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdSttlmCcy() {
        return reqdSttlmCcy;
    }

    /**
     * Sets the value of the reqdSttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionBulkOrder3 setReqdSttlmCcy(String value) {
        this.reqdSttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the reqdNAVCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdNAVCcy() {
        return reqdNAVCcy;
    }

    /**
     * Sets the value of the reqdNAVCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionBulkOrder3 setReqdNAVCcy(String value) {
        this.reqdNAVCcy = value;
        return this;
    }

    /**
     * Gets the value of the ttlSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlSttlmAmt() {
        return ttlSttlmAmt;
    }

    /**
     * Sets the value of the ttlSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public RedemptionBulkOrder3 setTtlSttlmAmt(ActiveCurrencyAndAmount value) {
        this.ttlSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the cshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getCshSttlmDt() {
        return cshSttlmDt;
    }

    /**
     * Sets the value of the cshSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionBulkOrder3 setCshSttlmDt(LocalDate value) {
        this.cshSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the blkCshSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction21 }
     *     
     */
    public PaymentTransaction21 getBlkCshSttlmDtls() {
        return blkCshSttlmDtls;
    }

    /**
     * Sets the value of the blkCshSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction21 }
     *     
     */
    public RedemptionBulkOrder3 setBlkCshSttlmDtls(PaymentTransaction21 value) {
        this.blkCshSttlmDtls = value;
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
     * Adds a new item to the indvOrdrDtls list.
     * @see #getIndvOrdrDtls()
     * 
     */
    public RedemptionBulkOrder3 addIndvOrdrDtls(RedemptionOrder5 indvOrdrDtls) {
        getIndvOrdrDtls().add(indvOrdrDtls);
        return this;
    }

}
