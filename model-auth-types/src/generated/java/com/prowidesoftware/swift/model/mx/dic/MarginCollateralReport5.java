
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
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
 * Details of margin collateral agreement between counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginCollateralReport5", propOrder = {
    "collPrtflCd",
    "collstnCtgy",
    "tmStmp"
})
public class MarginCollateralReport5 {

    @XmlElement(name = "CollPrtflCd", required = true)
    protected CollateralPortfolioCode6Choice collPrtflCd;
    @XmlElement(name = "CollstnCtgy", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralisationType3Code collstnCtgy;
    @XmlElement(name = "TmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime tmStmp;

    /**
     * Gets the value of the collPrtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralPortfolioCode6Choice }
     *     
     */
    public CollateralPortfolioCode6Choice getCollPrtflCd() {
        return collPrtflCd;
    }

    /**
     * Sets the value of the collPrtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralPortfolioCode6Choice }
     *     
     */
    public MarginCollateralReport5 setCollPrtflCd(CollateralPortfolioCode6Choice value) {
        this.collPrtflCd = value;
        return this;
    }

    /**
     * Gets the value of the collstnCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralisationType3Code }
     *     
     */
    public CollateralisationType3Code getCollstnCtgy() {
        return collstnCtgy;
    }

    /**
     * Sets the value of the collstnCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralisationType3Code }
     *     
     */
    public MarginCollateralReport5 setCollstnCtgy(CollateralisationType3Code value) {
        this.collstnCtgy = value;
        return this;
    }

    /**
     * Gets the value of the tmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getTmStmp() {
        return tmStmp;
    }

    /**
     * Sets the value of the tmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MarginCollateralReport5 setTmStmp(OffsetDateTime value) {
        this.tmStmp = value;
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
