
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
 * Recurrent query criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeRecurrentQuery7", propOrder = {
    "qryTp",
    "frqcy",
    "vldUntil"
})
public class TradeRecurrentQuery7 {

    @XmlElement(name = "QryTp", required = true)
    protected String qryTp;
    @XmlElement(name = "Frqcy", required = true)
    protected List<TradeQueryExecutionFrequency3> frqcy;
    @XmlElement(name = "VldUntil", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate vldUntil;

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeRecurrentQuery7 setQryTp(String value) {
        this.qryTp = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the frqcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrqcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeQueryExecutionFrequency3 }
     * 
     * 
     * @return
     *     The value of the frqcy property.
     */
    public List<TradeQueryExecutionFrequency3> getFrqcy() {
        if (frqcy == null) {
            frqcy = new ArrayList<>();
        }
        return this.frqcy;
    }

    /**
     * Gets the value of the vldUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getVldUntil() {
        return vldUntil;
    }

    /**
     * Sets the value of the vldUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeRecurrentQuery7 setVldUntil(LocalDate value) {
        this.vldUntil = value;
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
     * Adds a new item to the frqcy list.
     * @see #getFrqcy()
     * 
     */
    public TradeRecurrentQuery7 addFrqcy(TradeQueryExecutionFrequency3 frqcy) {
        getFrqcy().add(frqcy);
        return this;
    }

}
