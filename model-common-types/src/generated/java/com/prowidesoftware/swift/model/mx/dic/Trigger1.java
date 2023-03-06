
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
 * Trigger parameters.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trigger1", propOrder = {
    "dtChc",
    "dcmntryEvt"
})
public class Trigger1 {

    @XmlElement(name = "DtChc")
    protected FixedOrRecurrentDate1Choice dtChc;
    @XmlElement(name = "DcmntryEvt")
    protected List<Document10> dcmntryEvt;

    /**
     * Gets the value of the dtChc property.
     * 
     * @return
     *     possible object is
     *     {@link FixedOrRecurrentDate1Choice }
     *     
     */
    public FixedOrRecurrentDate1Choice getDtChc() {
        return dtChc;
    }

    /**
     * Sets the value of the dtChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedOrRecurrentDate1Choice }
     *     
     */
    public Trigger1 setDtChc(FixedOrRecurrentDate1Choice value) {
        this.dtChc = value;
        return this;
    }

    /**
     * Gets the value of the dcmntryEvt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dcmntryEvt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDcmntryEvt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document10 }
     * 
     * 
     */
    public List<Document10> getDcmntryEvt() {
        if (dcmntryEvt == null) {
            dcmntryEvt = new ArrayList<Document10>();
        }
        return this.dcmntryEvt;
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
     * Adds a new item to the dcmntryEvt list.
     * @see #getDcmntryEvt()
     * 
     */
    public Trigger1 addDcmntryEvt(Document10 dcmntryEvt) {
        getDcmntryEvt().add(dcmntryEvt);
        return this;
    }

}
