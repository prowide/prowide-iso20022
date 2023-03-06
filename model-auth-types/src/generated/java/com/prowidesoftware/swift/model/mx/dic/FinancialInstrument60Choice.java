
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
 * Choice to specify the information on  share class.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument60Choice", propOrder = {
    "noShrClssInf",
    "shrClssList"
})
public class FinancialInstrument60Choice {

    @XmlElement(name = "NoShrClssInf")
    protected ShareClassList1 noShrClssInf;
    @XmlElement(name = "ShrClssList")
    protected List<ShareClassList1> shrClssList;

    /**
     * Gets the value of the noShrClssInf property.
     * 
     * @return
     *     possible object is
     *     {@link ShareClassList1 }
     *     
     */
    public ShareClassList1 getNoShrClssInf() {
        return noShrClssInf;
    }

    /**
     * Sets the value of the noShrClssInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareClassList1 }
     *     
     */
    public FinancialInstrument60Choice setNoShrClssInf(ShareClassList1 value) {
        this.noShrClssInf = value;
        return this;
    }

    /**
     * Gets the value of the shrClssList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shrClssList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShrClssList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShareClassList1 }
     * 
     * 
     */
    public List<ShareClassList1> getShrClssList() {
        if (shrClssList == null) {
            shrClssList = new ArrayList<ShareClassList1>();
        }
        return this.shrClssList;
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
     * Adds a new item to the shrClssList list.
     * @see #getShrClssList()
     * 
     */
    public FinancialInstrument60Choice addShrClssList(ShareClassList1 shrClssList) {
        getShrClssList().add(shrClssList);
        return this;
    }

}
