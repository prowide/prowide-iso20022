
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the events where the constant net asset value per unit or share calculated in accordance with the amortised cost method deviates from the net asset value per unit or share calculated in accordance with the mark-to-market or mark-to-model method by more than 20 basis points.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstantNetAssetValueDeviationEvent1", propOrder = {
    "valtnDt",
    "cstNetAsstValPerUnit",
    "netAsstValPerUnit",
    "nbOfDaysDvtn",
    "avrgBsisPtSprd",
    "lwstPricDvtn",
    "hghstPricDvtn"
})
public class ConstantNetAssetValueDeviationEvent1 {

    @XmlElement(name = "ValtnDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valtnDt;
    @XmlElement(name = "CstNetAsstValPerUnit", required = true)
    protected CurrencyExchange14 cstNetAsstValPerUnit;
    @XmlElement(name = "NetAsstValPerUnit", required = true)
    protected CurrencyExchange14 netAsstValPerUnit;
    @XmlElement(name = "NbOfDaysDvtn", required = true)
    protected BigDecimal nbOfDaysDvtn;
    @XmlElement(name = "AvrgBsisPtSprd", required = true)
    protected BigDecimal avrgBsisPtSprd;
    @XmlElement(name = "LwstPricDvtn", required = true)
    protected BigDecimal lwstPricDvtn;
    @XmlElement(name = "HghstPricDvtn", required = true)
    protected BigDecimal hghstPricDvtn;

    /**
     * Gets the value of the valtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getValtnDt() {
        return valtnDt;
    }

    /**
     * Sets the value of the valtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ConstantNetAssetValueDeviationEvent1 setValtnDt(XMLGregorianCalendar value) {
        this.valtnDt = value;
        return this;
    }

    /**
     * Gets the value of the cstNetAsstValPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange14 }
     *     
     */
    public CurrencyExchange14 getCstNetAsstValPerUnit() {
        return cstNetAsstValPerUnit;
    }

    /**
     * Sets the value of the cstNetAsstValPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange14 }
     *     
     */
    public ConstantNetAssetValueDeviationEvent1 setCstNetAsstValPerUnit(CurrencyExchange14 value) {
        this.cstNetAsstValPerUnit = value;
        return this;
    }

    /**
     * Gets the value of the netAsstValPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange14 }
     *     
     */
    public CurrencyExchange14 getNetAsstValPerUnit() {
        return netAsstValPerUnit;
    }

    /**
     * Sets the value of the netAsstValPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange14 }
     *     
     */
    public ConstantNetAssetValueDeviationEvent1 setNetAsstValPerUnit(CurrencyExchange14 value) {
        this.netAsstValPerUnit = value;
        return this;
    }

    /**
     * Gets the value of the nbOfDaysDvtn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDaysDvtn() {
        return nbOfDaysDvtn;
    }

    /**
     * Sets the value of the nbOfDaysDvtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ConstantNetAssetValueDeviationEvent1 setNbOfDaysDvtn(BigDecimal value) {
        this.nbOfDaysDvtn = value;
        return this;
    }

    /**
     * Gets the value of the avrgBsisPtSprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvrgBsisPtSprd() {
        return avrgBsisPtSprd;
    }

    /**
     * Sets the value of the avrgBsisPtSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ConstantNetAssetValueDeviationEvent1 setAvrgBsisPtSprd(BigDecimal value) {
        this.avrgBsisPtSprd = value;
        return this;
    }

    /**
     * Gets the value of the lwstPricDvtn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLwstPricDvtn() {
        return lwstPricDvtn;
    }

    /**
     * Sets the value of the lwstPricDvtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ConstantNetAssetValueDeviationEvent1 setLwstPricDvtn(BigDecimal value) {
        this.lwstPricDvtn = value;
        return this;
    }

    /**
     * Gets the value of the hghstPricDvtn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHghstPricDvtn() {
        return hghstPricDvtn;
    }

    /**
     * Sets the value of the hghstPricDvtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ConstantNetAssetValueDeviationEvent1 setHghstPricDvtn(BigDecimal value) {
        this.hghstPricDvtn = value;
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
