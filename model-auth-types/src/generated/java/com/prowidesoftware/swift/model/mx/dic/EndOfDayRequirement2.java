
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Obligations of a clearing member with respect to a central counterparty that are calculated based on end of day positions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndOfDayRequirement2", propOrder = {
    "initlMrgnRqrmnts",
    "vartnMrgnRqrmnts",
    "mrgnAcctId"
})
public class EndOfDayRequirement2 {

    @XmlElement(name = "InitlMrgnRqrmnts", required = true)
    protected InitialMarginRequirement1 initlMrgnRqrmnts;
    @XmlElement(name = "VartnMrgnRqrmnts", required = true)
    protected AmountAndDirection102 vartnMrgnRqrmnts;
    @XmlElement(name = "MrgnAcctId", required = true)
    protected GenericIdentification165 mrgnAcctId;

    /**
     * Gets the value of the initlMrgnRqrmnts property.
     * 
     * @return
     *     possible object is
     *     {@link InitialMarginRequirement1 }
     *     
     */
    public InitialMarginRequirement1 getInitlMrgnRqrmnts() {
        return initlMrgnRqrmnts;
    }

    /**
     * Sets the value of the initlMrgnRqrmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialMarginRequirement1 }
     *     
     */
    public EndOfDayRequirement2 setInitlMrgnRqrmnts(InitialMarginRequirement1 value) {
        this.initlMrgnRqrmnts = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgnRqrmnts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getVartnMrgnRqrmnts() {
        return vartnMrgnRqrmnts;
    }

    /**
     * Sets the value of the vartnMrgnRqrmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public EndOfDayRequirement2 setVartnMrgnRqrmnts(AmountAndDirection102 value) {
        this.vartnMrgnRqrmnts = value;
        return this;
    }

    /**
     * Gets the value of the mrgnAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification165 }
     *     
     */
    public GenericIdentification165 getMrgnAcctId() {
        return mrgnAcctId;
    }

    /**
     * Sets the value of the mrgnAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification165 }
     *     
     */
    public EndOfDayRequirement2 setMrgnAcctId(GenericIdentification165 value) {
        this.mrgnAcctId = value;
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
