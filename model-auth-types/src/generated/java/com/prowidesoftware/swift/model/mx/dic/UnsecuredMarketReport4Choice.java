
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between a reason for no activity and the unsecured market segment transaction details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsecuredMarketReport4Choice", propOrder = {
    "dataSetActn",
    "tx"
})
public class UnsecuredMarketReport4Choice {

    @XmlElement(name = "DataSetActn")
    @XmlSchemaType(name = "string")
    protected ReportPeriodActivity3Code dataSetActn;
    @XmlElement(name = "Tx")
    protected List<UnsecuredMarketTransaction4> tx;

    /**
     * Gets the value of the dataSetActn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPeriodActivity3Code }
     *     
     */
    public ReportPeriodActivity3Code getDataSetActn() {
        return dataSetActn;
    }

    /**
     * Sets the value of the dataSetActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPeriodActivity3Code }
     *     
     */
    public UnsecuredMarketReport4Choice setDataSetActn(ReportPeriodActivity3Code value) {
        this.dataSetActn = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnsecuredMarketTransaction4 }
     * 
     * 
     */
    public List<UnsecuredMarketTransaction4> getTx() {
        if (tx == null) {
            tx = new ArrayList<UnsecuredMarketTransaction4>();
        }
        return this.tx;
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
     * Adds a new item to the tx list.
     * @see #getTx()
     * 
     */
    public UnsecuredMarketReport4Choice addTx(UnsecuredMarketTransaction4 tx) {
        getTx().add(tx);
        return this;
    }

}
