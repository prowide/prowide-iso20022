
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
 * Lock status of the party for processing in the system. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyLockStatus1", propOrder = {
    "vldFr",
    "sts",
    "lckRsn"
})
public class PartyLockStatus1 {

    @XmlElement(name = "VldFr", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate vldFr;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected LockStatus1Code sts;
    @XmlElement(name = "LckRsn")
    protected List<String> lckRsn;

    /**
     * Gets the value of the vldFr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getVldFr() {
        return vldFr;
    }

    /**
     * Sets the value of the vldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyLockStatus1 setVldFr(LocalDate value) {
        this.vldFr = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link LockStatus1Code }
     *     
     */
    public LockStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockStatus1Code }
     *     
     */
    public PartyLockStatus1 setSts(LockStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the lckRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lckRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLckRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the lckRsn property.
     */
    public List<String> getLckRsn() {
        if (lckRsn == null) {
            lckRsn = new ArrayList<>();
        }
        return this.lckRsn;
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
     * Adds a new item to the lckRsn list.
     * @see #getLckRsn()
     * 
     */
    public PartyLockStatus1 addLckRsn(String lckRsn) {
        getLckRsn().add(lckRsn);
        return this;
    }

}
