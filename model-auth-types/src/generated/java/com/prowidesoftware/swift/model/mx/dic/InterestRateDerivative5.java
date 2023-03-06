
package com.prowidesoftware.swift.model.mx.dic;

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
 * Specifies the interest rate derivative specific elements for interest rate derivatives as defined in the local regulation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestRateDerivative5", propOrder = {
    "undrlygTp",
    "undrlygBd",
    "swptnNtnlCcy",
    "undrlygSwpMtrtyDt",
    "infltnIndx",
    "intrstRateRef"
})
public class InterestRateDerivative5 {

    @XmlElement(name = "UndrlygTp", required = true)
    protected InterestRateDerivative2Choice undrlygTp;
    @XmlElement(name = "UndrlygBd")
    protected BondDerivative2 undrlygBd;
    @XmlElement(name = "SwptnNtnlCcy")
    protected String swptnNtnlCcy;
    @XmlElement(name = "UndrlygSwpMtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar undrlygSwpMtrtyDt;
    @XmlElement(name = "InfltnIndx")
    protected InflationIndex1Choice infltnIndx;
    @XmlElement(name = "IntrstRateRef", required = true)
    protected FloatingInterestRate8 intrstRateRef;

    /**
     * Gets the value of the undrlygTp property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateDerivative2Choice }
     *     
     */
    public InterestRateDerivative2Choice getUndrlygTp() {
        return undrlygTp;
    }

    /**
     * Sets the value of the undrlygTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateDerivative2Choice }
     *     
     */
    public InterestRateDerivative5 setUndrlygTp(InterestRateDerivative2Choice value) {
        this.undrlygTp = value;
        return this;
    }

    /**
     * Gets the value of the undrlygBd property.
     * 
     * @return
     *     possible object is
     *     {@link BondDerivative2 }
     *     
     */
    public BondDerivative2 getUndrlygBd() {
        return undrlygBd;
    }

    /**
     * Sets the value of the undrlygBd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BondDerivative2 }
     *     
     */
    public InterestRateDerivative5 setUndrlygBd(BondDerivative2 value) {
        this.undrlygBd = value;
        return this;
    }

    /**
     * Gets the value of the swptnNtnlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwptnNtnlCcy() {
        return swptnNtnlCcy;
    }

    /**
     * Sets the value of the swptnNtnlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestRateDerivative5 setSwptnNtnlCcy(String value) {
        this.swptnNtnlCcy = value;
        return this;
    }

    /**
     * Gets the value of the undrlygSwpMtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getUndrlygSwpMtrtyDt() {
        return undrlygSwpMtrtyDt;
    }

    /**
     * Sets the value of the undrlygSwpMtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestRateDerivative5 setUndrlygSwpMtrtyDt(XMLGregorianCalendar value) {
        this.undrlygSwpMtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the infltnIndx property.
     * 
     * @return
     *     possible object is
     *     {@link InflationIndex1Choice }
     *     
     */
    public InflationIndex1Choice getInfltnIndx() {
        return infltnIndx;
    }

    /**
     * Sets the value of the infltnIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link InflationIndex1Choice }
     *     
     */
    public InterestRateDerivative5 setInfltnIndx(InflationIndex1Choice value) {
        this.infltnIndx = value;
        return this;
    }

    /**
     * Gets the value of the intrstRateRef property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingInterestRate8 }
     *     
     */
    public FloatingInterestRate8 getIntrstRateRef() {
        return intrstRateRef;
    }

    /**
     * Sets the value of the intrstRateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingInterestRate8 }
     *     
     */
    public InterestRateDerivative5 setIntrstRateRef(FloatingInterestRate8 value) {
        this.intrstRateRef = value;
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
