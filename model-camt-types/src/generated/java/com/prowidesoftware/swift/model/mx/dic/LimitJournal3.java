
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
 * Record where all transactions are originally entered. The journal details which transactions occurred and what accounts were affected.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitJournal3", propOrder = {
    "lmt",
    "jrnlActvtyDt",
    "jrnlNtry"
})
public class LimitJournal3 {

    @XmlElement(name = "Lmt", required = true)
    protected LimitAmount1 lmt;
    @XmlElement(name = "JrnlActvtyDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate jrnlActvtyDt;
    @XmlElement(name = "JrnlNtry")
    protected List<LimitJournalEntry3> jrnlNtry;

    /**
     * Gets the value of the lmt property.
     * 
     * @return
     *     possible object is
     *     {@link LimitAmount1 }
     *     
     */
    public LimitAmount1 getLmt() {
        return lmt;
    }

    /**
     * Sets the value of the lmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitAmount1 }
     *     
     */
    public LimitJournal3 setLmt(LimitAmount1 value) {
        this.lmt = value;
        return this;
    }

    /**
     * Gets the value of the jrnlActvtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getJrnlActvtyDt() {
        return jrnlActvtyDt;
    }

    /**
     * Sets the value of the jrnlActvtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LimitJournal3 setJrnlActvtyDt(LocalDate value) {
        this.jrnlActvtyDt = value;
        return this;
    }

    /**
     * Gets the value of the jrnlNtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the jrnlNtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJrnlNtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitJournalEntry3 }
     * 
     * 
     * @return
     *     The value of the jrnlNtry property.
     */
    public List<LimitJournalEntry3> getJrnlNtry() {
        if (jrnlNtry == null) {
            jrnlNtry = new ArrayList<>();
        }
        return this.jrnlNtry;
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
     * Adds a new item to the jrnlNtry list.
     * @see #getJrnlNtry()
     * 
     */
    public LimitJournal3 addJrnlNtry(LimitJournalEntry3 jrnlNtry) {
        getJrnlNtry().add(jrnlNtry);
        return this;
    }

}
