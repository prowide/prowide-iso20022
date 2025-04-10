
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
@XmlType(name = "MarginCollateralReport4", propOrder = {
    "collPrtflCd",
    "collstnCtgy",
    "tmStmp"
})
public class MarginCollateralReport4 {

    @XmlElement(name = "CollPrtflCd", required = true)
    protected CollateralPortfolioCode5Choice collPrtflCd;
    @XmlElement(name = "CollstnCtgy", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralisationType3Code collstnCtgy;
    @XmlElement(name = "TmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tmStmp;

    /**
     * Gets the value of the collPrtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralPortfolioCode5Choice }
     *     
     */
    public CollateralPortfolioCode5Choice getCollPrtflCd() {
        return collPrtflCd;
    }

    /**
     * Sets the value of the collPrtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralPortfolioCode5Choice }
     *     
     */
    public MarginCollateralReport4 setCollPrtflCd(CollateralPortfolioCode5Choice value) {
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
    public MarginCollateralReport4 setCollstnCtgy(CollateralisationType3Code value) {
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
    public XMLGregorianCalendar getTmStmp() {
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
    public MarginCollateralReport4 setTmStmp(XMLGregorianCalendar value) {
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
