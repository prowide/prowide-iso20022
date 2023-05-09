
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Details of the events where the price of an asset valued by using the amortised cost method deviates from the price of that asset by more than 10 basis points.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmortisedCostMethodPriceDeviationEvent1", propOrder = {
    "valtnDt",
    "asstId",
    "rptgCcyMktPric",
    "rptgCcyAmtsdCostPric",
    "nbOfDaysDvtn",
    "avrgBsisPtSprd",
    "lwstPricDvtn",
    "hghstPricDvtn"
})
public class AmortisedCostMethodPriceDeviationEvent1 {

    @XmlElement(name = "ValtnDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate valtnDt;
    @XmlElement(name = "AsstId", required = true)
    protected SecurityIdentification33 asstId;
    @XmlElement(name = "RptgCcyMktPric", required = true)
    protected ActiveCurrencyAndAmount rptgCcyMktPric;
    @XmlElement(name = "RptgCcyAmtsdCostPric", required = true)
    protected ActiveCurrencyAndAmount rptgCcyAmtsdCostPric;
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
    public LocalDate getValtnDt() {
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
    public AmortisedCostMethodPriceDeviationEvent1 setValtnDt(LocalDate value) {
        this.valtnDt = value;
        return this;
    }

    /**
     * Gets the value of the asstId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification33 }
     *     
     */
    public SecurityIdentification33 getAsstId() {
        return asstId;
    }

    /**
     * Sets the value of the asstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification33 }
     *     
     */
    public AmortisedCostMethodPriceDeviationEvent1 setAsstId(SecurityIdentification33 value) {
        this.asstId = value;
        return this;
    }

    /**
     * Gets the value of the rptgCcyMktPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRptgCcyMktPric() {
        return rptgCcyMktPric;
    }

    /**
     * Sets the value of the rptgCcyMktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AmortisedCostMethodPriceDeviationEvent1 setRptgCcyMktPric(ActiveCurrencyAndAmount value) {
        this.rptgCcyMktPric = value;
        return this;
    }

    /**
     * Gets the value of the rptgCcyAmtsdCostPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRptgCcyAmtsdCostPric() {
        return rptgCcyAmtsdCostPric;
    }

    /**
     * Sets the value of the rptgCcyAmtsdCostPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AmortisedCostMethodPriceDeviationEvent1 setRptgCcyAmtsdCostPric(ActiveCurrencyAndAmount value) {
        this.rptgCcyAmtsdCostPric = value;
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
    public AmortisedCostMethodPriceDeviationEvent1 setNbOfDaysDvtn(BigDecimal value) {
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
    public AmortisedCostMethodPriceDeviationEvent1 setAvrgBsisPtSprd(BigDecimal value) {
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
    public AmortisedCostMethodPriceDeviationEvent1 setLwstPricDvtn(BigDecimal value) {
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
    public AmortisedCostMethodPriceDeviationEvent1 setHghstPricDvtn(BigDecimal value) {
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
