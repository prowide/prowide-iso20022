
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
 * Includes a set of dates (e.g. credit date) related to settlement of the financing amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingDateDetails1", propOrder = {
    "bookDt",
    "cdtDt",
    "dbtDt"
})
public class FinancingDateDetails1 {

    @XmlElement(name = "BookDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> bookDt;
    @XmlElement(name = "CdtDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cdtDt;
    @XmlElement(name = "DbtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dbtDt;

    /**
     * Gets the value of the bookDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getBookDt() {
        if (bookDt == null) {
            bookDt = new ArrayList<XMLGregorianCalendar>();
        }
        return this.bookDt;
    }

    /**
     * Gets the value of the cdtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getCdtDt() {
        return cdtDt;
    }

    /**
     * Sets the value of the cdtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancingDateDetails1 setCdtDt(XMLGregorianCalendar value) {
        this.cdtDt = value;
        return this;
    }

    /**
     * Gets the value of the dbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDbtDt() {
        return dbtDt;
    }

    /**
     * Sets the value of the dbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancingDateDetails1 setDbtDt(XMLGregorianCalendar value) {
        this.dbtDt = value;
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
     * Adds a new item to the bookDt list.
     * @see #getBookDt()
     * 
     */
    public FinancingDateDetails1 addBookDt(XMLGregorianCalendar bookDt) {
        getBookDt().add(bookDt);
        return this;
    }

}
