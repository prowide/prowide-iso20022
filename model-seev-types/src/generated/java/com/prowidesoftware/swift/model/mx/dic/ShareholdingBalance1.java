
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides detailed shareholding balance information for an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareholdingBalance1", propOrder = {
    "shrhldgTp",
    "qty",
    "initlDtOfShrhldg",
    "thrdPty",
    "splmtryData"
})
public class ShareholdingBalance1 {

    @XmlElement(name = "ShrhldgTp", required = true)
    @XmlSchemaType(name = "string")
    protected ShareholdingType1Code shrhldgTp;
    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity18Choice qty;
    @XmlElement(name = "InitlDtOfShrhldg")
    protected DateFormat57Choice initlDtOfShrhldg;
    @XmlElement(name = "ThrdPty")
    protected List<PartyIdentification218> thrdPty;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the shrhldgTp property.
     * 
     * @return
     *     possible object is
     *     {@link ShareholdingType1Code }
     *     
     */
    public ShareholdingType1Code getShrhldgTp() {
        return shrhldgTp;
    }

    /**
     * Sets the value of the shrhldgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareholdingType1Code }
     *     
     */
    public ShareholdingBalance1 setShrhldgTp(ShareholdingType1Code value) {
        this.shrhldgTp = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public ShareholdingBalance1 setQty(FinancialInstrumentQuantity18Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the initlDtOfShrhldg property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat57Choice }
     *     
     */
    public DateFormat57Choice getInitlDtOfShrhldg() {
        return initlDtOfShrhldg;
    }

    /**
     * Sets the value of the initlDtOfShrhldg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat57Choice }
     *     
     */
    public ShareholdingBalance1 setInitlDtOfShrhldg(DateFormat57Choice value) {
        this.initlDtOfShrhldg = value;
        return this;
    }

    /**
     * Gets the value of the thrdPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the thrdPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThrdPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification218 }
     * 
     * 
     * @return
     *     The value of the thrdPty property.
     */
    public List<PartyIdentification218> getThrdPty() {
        if (thrdPty == null) {
            thrdPty = new ArrayList<>();
        }
        return this.thrdPty;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
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
     * Adds a new item to the thrdPty list.
     * @see #getThrdPty()
     * 
     */
    public ShareholdingBalance1 addThrdPty(PartyIdentification218 thrdPty) {
        getThrdPty().add(thrdPty);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ShareholdingBalance1 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
