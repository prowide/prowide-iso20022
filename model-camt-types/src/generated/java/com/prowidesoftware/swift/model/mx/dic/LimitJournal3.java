
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
    protected XMLGregorianCalendar jrnlActvtyDt;
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
    public XMLGregorianCalendar getJrnlActvtyDt() {
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
    public LimitJournal3 setJrnlActvtyDt(XMLGregorianCalendar value) {
        this.jrnlActvtyDt = value;
        return this;
    }

    /**
     * Gets the value of the jrnlNtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jrnlNtry property.
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
     */
    public List<LimitJournalEntry3> getJrnlNtry() {
        if (jrnlNtry == null) {
            jrnlNtry = new ArrayList<LimitJournalEntry3>();
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
