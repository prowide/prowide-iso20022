
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information on an event that happened in a system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event2", propOrder = {
    "evtCd",
    "evtParam",
    "evtDesc",
    "evtTm"
})
public class Event2 {

    @XmlElement(name = "EvtCd", required = true)
    protected String evtCd;
    @XmlElement(name = "EvtParam")
    protected List<String> evtParam;
    @XmlElement(name = "EvtDesc")
    protected String evtDesc;
    @XmlElement(name = "EvtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar evtTm;

    /**
     * Gets the value of the evtCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtCd() {
        return evtCd;
    }

    /**
     * Sets the value of the evtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Event2 setEvtCd(String value) {
        this.evtCd = value;
        return this;
    }

    /**
     * Gets the value of the evtParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evtParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEvtParam() {
        if (evtParam == null) {
            evtParam = new ArrayList<String>();
        }
        return this.evtParam;
    }

    /**
     * Gets the value of the evtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtDesc() {
        return evtDesc;
    }

    /**
     * Sets the value of the evtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Event2 setEvtDesc(String value) {
        this.evtDesc = value;
        return this;
    }

    /**
     * Gets the value of the evtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getEvtTm() {
        return evtTm;
    }

    /**
     * Sets the value of the evtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Event2 setEvtTm(XMLGregorianCalendar value) {
        this.evtTm = value;
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
     * Adds a new item to the evtParam list.
     * @see #getEvtParam()
     * 
     */
    public Event2 addEvtParam(String evtParam) {
        getEvtParam().add(evtParam);
        return this;
    }

}
