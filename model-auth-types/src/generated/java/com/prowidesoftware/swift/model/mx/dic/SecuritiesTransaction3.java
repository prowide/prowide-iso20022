
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * Provides the details of the reported transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransaction3", propOrder = {
    "tradDt",
    "tradgCpcty",
    "qty",
    "dgtlTknQty",
    "derivNtnlChng",
    "pric",
    "netAmt",
    "tradVn",
    "ctryOfBrnch",
    "upFrntPmt",
    "tradPlcMtchgId",
    "cmplxTradCmpntId"
})
public class SecuritiesTransaction3 {

    @XmlElement(name = "TradDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime tradDt;
    @XmlElement(name = "TradgCpcty", required = true)
    @XmlSchemaType(name = "string")
    protected RegulatoryTradingCapacity1Code tradgCpcty;
    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity25Choice qty;
    @XmlElement(name = "DgtlTknQty")
    protected List<DigitalTokenAmount2> dgtlTknQty;
    @XmlElement(name = "DerivNtnlChng")
    @XmlSchemaType(name = "string")
    protected VariationType1Code derivNtnlChng;
    @XmlElement(name = "Pric", required = true)
    protected SecuritiesTransactionPrice22Choice pric;
    @XmlElement(name = "NetAmt")
    protected BigDecimal netAmt;
    @XmlElement(name = "TradVn", required = true)
    protected String tradVn;
    @XmlElement(name = "CtryOfBrnch")
    protected String ctryOfBrnch;
    @XmlElement(name = "UpFrntPmt")
    protected AmountAndDirection53 upFrntPmt;
    @XmlElement(name = "TradPlcMtchgId")
    protected String tradPlcMtchgId;
    @XmlElement(name = "CmplxTradCmpntId")
    protected String cmplxTradCmpntId;

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesTransaction3 setTradDt(OffsetDateTime value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the tradgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryTradingCapacity1Code }
     *     
     */
    public RegulatoryTradingCapacity1Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Sets the value of the tradgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryTradingCapacity1Code }
     *     
     */
    public SecuritiesTransaction3 setTradgCpcty(RegulatoryTradingCapacity1Code value) {
        this.tradgCpcty = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public FinancialInstrumentQuantity25Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public SecuritiesTransaction3 setQty(FinancialInstrumentQuantity25Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the dgtlTknQty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dgtlTknQty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgtlTknQty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DigitalTokenAmount2 }
     * 
     * 
     * @return
     *     The value of the dgtlTknQty property.
     */
    public List<DigitalTokenAmount2> getDgtlTknQty() {
        if (dgtlTknQty == null) {
            dgtlTknQty = new ArrayList<>();
        }
        return this.dgtlTknQty;
    }

    /**
     * Gets the value of the derivNtnlChng property.
     * 
     * @return
     *     possible object is
     *     {@link VariationType1Code }
     *     
     */
    public VariationType1Code getDerivNtnlChng() {
        return derivNtnlChng;
    }

    /**
     * Sets the value of the derivNtnlChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationType1Code }
     *     
     */
    public SecuritiesTransaction3 setDerivNtnlChng(VariationType1Code value) {
        this.derivNtnlChng = value;
        return this;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice22Choice }
     *     
     */
    public SecuritiesTransactionPrice22Choice getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice22Choice }
     *     
     */
    public SecuritiesTransaction3 setPric(SecuritiesTransactionPrice22Choice value) {
        this.pric = value;
        return this;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SecuritiesTransaction3 setNetAmt(BigDecimal value) {
        this.netAmt = value;
        return this;
    }

    /**
     * Gets the value of the tradVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradVn() {
        return tradVn;
    }

    /**
     * Sets the value of the tradVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesTransaction3 setTradVn(String value) {
        this.tradVn = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfBrnch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfBrnch() {
        return ctryOfBrnch;
    }

    /**
     * Sets the value of the ctryOfBrnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesTransaction3 setCtryOfBrnch(String value) {
        this.ctryOfBrnch = value;
        return this;
    }

    /**
     * Gets the value of the upFrntPmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public AmountAndDirection53 getUpFrntPmt() {
        return upFrntPmt;
    }

    /**
     * Sets the value of the upFrntPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public SecuritiesTransaction3 setUpFrntPmt(AmountAndDirection53 value) {
        this.upFrntPmt = value;
        return this;
    }

    /**
     * Gets the value of the tradPlcMtchgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradPlcMtchgId() {
        return tradPlcMtchgId;
    }

    /**
     * Sets the value of the tradPlcMtchgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesTransaction3 setTradPlcMtchgId(String value) {
        this.tradPlcMtchgId = value;
        return this;
    }

    /**
     * Gets the value of the cmplxTradCmpntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmplxTradCmpntId() {
        return cmplxTradCmpntId;
    }

    /**
     * Sets the value of the cmplxTradCmpntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesTransaction3 setCmplxTradCmpntId(String value) {
        this.cmplxTradCmpntId = value;
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
     * Adds a new item to the dgtlTknQty list.
     * @see #getDgtlTknQty()
     * 
     */
    public SecuritiesTransaction3 addDgtlTknQty(DigitalTokenAmount2 dgtlTknQty) {
        getDgtlTknQty().add(dgtlTknQty);
        return this;
    }

}
