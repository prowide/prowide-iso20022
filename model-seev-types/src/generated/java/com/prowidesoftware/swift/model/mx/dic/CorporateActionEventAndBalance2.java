
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Detailed account holdings information report for a corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionEventAndBalance2", propOrder = {
    "gnlInf",
    "undrlygScty",
    "bal",
    "xtnsn"
})
public class CorporateActionEventAndBalance2 {

    @XmlElement(name = "GnlInf", required = true)
    protected EventInformation2 gnlInf;
    @XmlElement(name = "UndrlygScty", required = true)
    protected UnderlyingSecurity2 undrlygScty;
    @XmlElement(name = "Bal")
    protected CorporateActionBalanceDetails8 bal;
    @XmlElement(name = "Xtnsn")
    protected List<Extension2> xtnsn;

    /**
     * Gets the value of the gnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link EventInformation2 }
     *     
     */
    public EventInformation2 getGnlInf() {
        return gnlInf;
    }

    /**
     * Sets the value of the gnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventInformation2 }
     *     
     */
    public CorporateActionEventAndBalance2 setGnlInf(EventInformation2 value) {
        this.gnlInf = value;
        return this;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingSecurity2 }
     *     
     */
    public UnderlyingSecurity2 getUndrlygScty() {
        return undrlygScty;
    }

    /**
     * Sets the value of the undrlygScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingSecurity2 }
     *     
     */
    public CorporateActionEventAndBalance2 setUndrlygScty(UnderlyingSecurity2 value) {
        this.undrlygScty = value;
        return this;
    }

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionBalanceDetails8 }
     *     
     */
    public CorporateActionBalanceDetails8 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionBalanceDetails8 }
     *     
     */
    public CorporateActionEventAndBalance2 setBal(CorporateActionBalanceDetails8 value) {
        this.bal = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension2 }
     * 
     * 
     */
    public List<Extension2> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension2>();
        }
        return this.xtnsn;
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
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public CorporateActionEventAndBalance2 addXtnsn(Extension2 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
