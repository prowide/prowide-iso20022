
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the valuation details per exposure type aggregation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExposureTypeAggregation3", propOrder = {
    "xpsrTp",
    "sttlmPrc",
    "valtnAmts",
    "mrgnRate",
    "gblXpsrTpSts"
})
public class ExposureTypeAggregation3 {

    @XmlElement(name = "XpsrTp", required = true)
    protected ExposureType23Choice xpsrTp;
    @XmlElement(name = "SttlmPrc")
    protected GenericIdentification30 sttlmPrc;
    @XmlElement(name = "ValtnAmts", required = true)
    protected List<CollateralAmount16> valtnAmts;
    @XmlElement(name = "MrgnRate")
    protected BigDecimal mrgnRate;
    @XmlElement(name = "GblXpsrTpSts")
    @XmlSchemaType(name = "string")
    protected CollateralStatus1Code gblXpsrTpSts;

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType23Choice }
     *     
     */
    public ExposureType23Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType23Choice }
     *     
     */
    public ExposureTypeAggregation3 setXpsrTp(ExposureType23Choice value) {
        this.xpsrTp = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPrc property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getSttlmPrc() {
        return sttlmPrc;
    }

    /**
     * Sets the value of the sttlmPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public ExposureTypeAggregation3 setSttlmPrc(GenericIdentification30 value) {
        this.sttlmPrc = value;
        return this;
    }

    /**
     * Gets the value of the valtnAmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the valtnAmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValtnAmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralAmount16 }
     * 
     * 
     * @return
     *     The value of the valtnAmts property.
     */
    public List<CollateralAmount16> getValtnAmts() {
        if (valtnAmts == null) {
            valtnAmts = new ArrayList<>();
        }
        return this.valtnAmts;
    }

    /**
     * Gets the value of the mrgnRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMrgnRate() {
        return mrgnRate;
    }

    /**
     * Sets the value of the mrgnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ExposureTypeAggregation3 setMrgnRate(BigDecimal value) {
        this.mrgnRate = value;
        return this;
    }

    /**
     * Gets the value of the gblXpsrTpSts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralStatus1Code }
     *     
     */
    public CollateralStatus1Code getGblXpsrTpSts() {
        return gblXpsrTpSts;
    }

    /**
     * Sets the value of the gblXpsrTpSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralStatus1Code }
     *     
     */
    public ExposureTypeAggregation3 setGblXpsrTpSts(CollateralStatus1Code value) {
        this.gblXpsrTpSts = value;
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
     * Adds a new item to the valtnAmts list.
     * @see #getValtnAmts()
     * 
     */
    public ExposureTypeAggregation3 addValtnAmts(CollateralAmount16 valtnAmts) {
        getValtnAmts().add(valtnAmts);
        return this;
    }

}
