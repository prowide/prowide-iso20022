
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
 * Choice between the type of collateral proposed for the margin call.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposalType1Choice", propOrder = {
    "sctiesColl",
    "cshColl",
    "othrColl"
})
public class ProposalType1Choice {

    @XmlElement(name = "SctiesColl")
    protected List<SecuritiesCollateral1> sctiesColl;
    @XmlElement(name = "CshColl")
    protected List<CashCollateral1> cshColl;
    @XmlElement(name = "OthrColl")
    protected List<OtherCollateral1> othrColl;

    /**
     * Gets the value of the sctiesColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesCollateral1 }
     * 
     * 
     * @return
     *     The value of the sctiesColl property.
     */
    public List<SecuritiesCollateral1> getSctiesColl() {
        if (sctiesColl == null) {
            sctiesColl = new ArrayList<>();
        }
        return this.sctiesColl;
    }

    /**
     * Gets the value of the cshColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashCollateral1 }
     * 
     * 
     * @return
     *     The value of the cshColl property.
     */
    public List<CashCollateral1> getCshColl() {
        if (cshColl == null) {
            cshColl = new ArrayList<>();
        }
        return this.cshColl;
    }

    /**
     * Gets the value of the othrColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherCollateral1 }
     * 
     * 
     * @return
     *     The value of the othrColl property.
     */
    public List<OtherCollateral1> getOthrColl() {
        if (othrColl == null) {
            othrColl = new ArrayList<>();
        }
        return this.othrColl;
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
     * Adds a new item to the sctiesColl list.
     * @see #getSctiesColl()
     * 
     */
    public ProposalType1Choice addSctiesColl(SecuritiesCollateral1 sctiesColl) {
        getSctiesColl().add(sctiesColl);
        return this;
    }

    /**
     * Adds a new item to the cshColl list.
     * @see #getCshColl()
     * 
     */
    public ProposalType1Choice addCshColl(CashCollateral1 cshColl) {
        getCshColl().add(cshColl);
        return this;
    }

    /**
     * Adds a new item to the othrColl list.
     * @see #getOthrColl()
     * 
     */
    public ProposalType1Choice addOthrColl(OtherCollateral1 othrColl) {
        getOthrColl().add(othrColl);
        return this;
    }

}
