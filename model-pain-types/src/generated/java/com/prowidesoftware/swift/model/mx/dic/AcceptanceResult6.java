
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Set of elements used to provide detailed information on the acceptance result.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptanceResult6", propOrder = {
    "accptd",
    "rjctRsn",
    "addtlRjctRsnInf"
})
public class AcceptanceResult6 {

    @XmlElement(name = "Accptd")
    protected boolean accptd;
    @XmlElement(name = "RjctRsn")
    protected MandateReason1Choice rjctRsn;
    @XmlElement(name = "AddtlRjctRsnInf")
    protected List<String> addtlRjctRsnInf;

    /**
     * Gets the value of the accptd property.
     * 
     */
    public boolean isAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     */
    public AcceptanceResult6 setAccptd(boolean value) {
        this.accptd = value;
        return this;
    }

    /**
     * Gets the value of the rjctRsn property.
     * 
     * @return
     *     possible object is
     *     {@link MandateReason1Choice }
     *     
     */
    public MandateReason1Choice getRjctRsn() {
        return rjctRsn;
    }

    /**
     * Sets the value of the rjctRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateReason1Choice }
     *     
     */
    public AcceptanceResult6 setRjctRsn(MandateReason1Choice value) {
        this.rjctRsn = value;
        return this;
    }

    /**
     * Gets the value of the addtlRjctRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlRjctRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRjctRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlRjctRsnInf property.
     */
    public List<String> getAddtlRjctRsnInf() {
        if (addtlRjctRsnInf == null) {
            addtlRjctRsnInf = new ArrayList<>();
        }
        return this.addtlRjctRsnInf;
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
     * Adds a new item to the addtlRjctRsnInf list.
     * @see #getAddtlRjctRsnInf()
     * 
     */
    public AcceptanceResult6 addAddtlRjctRsnInf(String addtlRjctRsnInf) {
        getAddtlRjctRsnInf().add(addtlRjctRsnInf);
        return this;
    }

}
