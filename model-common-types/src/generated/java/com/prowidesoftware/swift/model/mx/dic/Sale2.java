
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
 * Details of good and services included in the sale.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sale2", propOrder = {
    "summry",
    "lineItm"
})
public class Sale2 {

    @XmlElement(name = "Summry")
    protected SaleSummary1 summry;
    @XmlElement(name = "LineItm")
    protected List<SaleItem3> lineItm;

    /**
     * Gets the value of the summry property.
     * 
     * @return
     *     possible object is
     *     {@link SaleSummary1 }
     *     
     */
    public SaleSummary1 getSummry() {
        return summry;
    }

    /**
     * Sets the value of the summry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleSummary1 }
     *     
     */
    public Sale2 setSummry(SaleSummary1 value) {
        this.summry = value;
        return this;
    }

    /**
     * Gets the value of the lineItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaleItem3 }
     * 
     * 
     */
    public List<SaleItem3> getLineItm() {
        if (lineItm == null) {
            lineItm = new ArrayList<SaleItem3>();
        }
        return this.lineItm;
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
     * Adds a new item to the lineItm list.
     * @see #getLineItm()
     * 
     */
    public Sale2 addLineItm(SaleItem3 lineItm) {
        getLineItm().add(lineItm);
        return this;
    }

}
