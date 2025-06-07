
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
 * Provides details on the calculation of the default fund and the collateral that has been posted by the clearing member.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultFundReport1", propOrder = {
    "dfltFndClctn",
    "collDesc",
    "netXcssOrDfcit"
})
public class DefaultFundReport1 {

    @XmlElement(name = "DfltFndClctn", required = true)
    protected List<DefaultFund1> dfltFndClctn;
    @XmlElement(name = "CollDesc", required = true)
    protected List<Collateral3> collDesc;
    @XmlElement(name = "NetXcssOrDfcit", required = true)
    protected AmountAndDirection21 netXcssOrDfcit;

    /**
     * Gets the value of the dfltFndClctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dfltFndClctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDfltFndClctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultFund1 }
     * 
     * 
     */
    public List<DefaultFund1> getDfltFndClctn() {
        if (dfltFndClctn == null) {
            dfltFndClctn = new ArrayList<DefaultFund1>();
        }
        return this.dfltFndClctn;
    }

    /**
     * Gets the value of the collDesc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collDesc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Collateral3 }
     * 
     * 
     */
    public List<Collateral3> getCollDesc() {
        if (collDesc == null) {
            collDesc = new ArrayList<Collateral3>();
        }
        return this.collDesc;
    }

    /**
     * Gets the value of the netXcssOrDfcit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getNetXcssOrDfcit() {
        return netXcssOrDfcit;
    }

    /**
     * Sets the value of the netXcssOrDfcit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public DefaultFundReport1 setNetXcssOrDfcit(AmountAndDirection21 value) {
        this.netXcssOrDfcit = value;
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
     * Adds a new item to the dfltFndClctn list.
     * @see #getDfltFndClctn()
     * 
     */
    public DefaultFundReport1 addDfltFndClctn(DefaultFund1 dfltFndClctn) {
        getDfltFndClctn().add(dfltFndClctn);
        return this;
    }

    /**
     * Adds a new item to the collDesc list.
     * @see #getCollDesc()
     * 
     */
    public DefaultFundReport1 addCollDesc(Collateral3 collDesc) {
        getCollDesc().add(collDesc);
        return this;
    }

}
