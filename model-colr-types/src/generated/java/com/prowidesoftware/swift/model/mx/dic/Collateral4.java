
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
 * Provides details on the collateral that will be either delivered, returned or both.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collateral4", propOrder = {
    "mrgnCallReqId",
    "mrgnCallRspnId",
    "stdSttlmInstrs",
    "collPrpslRspnId",
    "sctiesColl",
    "cshColl",
    "othrColl"
})
public class Collateral4 {

    @XmlElement(name = "MrgnCallReqId", required = true)
    protected String mrgnCallReqId;
    @XmlElement(name = "MrgnCallRspnId", required = true)
    protected String mrgnCallRspnId;
    @XmlElement(name = "StdSttlmInstrs", required = true)
    protected String stdSttlmInstrs;
    @XmlElement(name = "CollPrpslRspnId")
    protected String collPrpslRspnId;
    @XmlElement(name = "SctiesColl")
    protected List<SecuritiesCollateral1> sctiesColl;
    @XmlElement(name = "CshColl")
    protected List<CashCollateral1> cshColl;
    @XmlElement(name = "OthrColl")
    protected List<OtherCollateral1> othrColl;

    /**
     * Gets the value of the mrgnCallReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrgnCallReqId() {
        return mrgnCallReqId;
    }

    /**
     * Sets the value of the mrgnCallReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Collateral4 setMrgnCallReqId(String value) {
        this.mrgnCallReqId = value;
        return this;
    }

    /**
     * Gets the value of the mrgnCallRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrgnCallRspnId() {
        return mrgnCallRspnId;
    }

    /**
     * Sets the value of the mrgnCallRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Collateral4 setMrgnCallRspnId(String value) {
        this.mrgnCallRspnId = value;
        return this;
    }

    /**
     * Gets the value of the stdSttlmInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdSttlmInstrs() {
        return stdSttlmInstrs;
    }

    /**
     * Sets the value of the stdSttlmInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Collateral4 setStdSttlmInstrs(String value) {
        this.stdSttlmInstrs = value;
        return this;
    }

    /**
     * Gets the value of the collPrpslRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollPrpslRspnId() {
        return collPrpslRspnId;
    }

    /**
     * Sets the value of the collPrpslRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Collateral4 setCollPrpslRspnId(String value) {
        this.collPrpslRspnId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesColl property.
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
     */
    public List<SecuritiesCollateral1> getSctiesColl() {
        if (sctiesColl == null) {
            sctiesColl = new ArrayList<SecuritiesCollateral1>();
        }
        return this.sctiesColl;
    }

    /**
     * Gets the value of the cshColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshColl property.
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
     */
    public List<CashCollateral1> getCshColl() {
        if (cshColl == null) {
            cshColl = new ArrayList<CashCollateral1>();
        }
        return this.cshColl;
    }

    /**
     * Gets the value of the othrColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrColl property.
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
     */
    public List<OtherCollateral1> getOthrColl() {
        if (othrColl == null) {
            othrColl = new ArrayList<OtherCollateral1>();
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
    public Collateral4 addSctiesColl(SecuritiesCollateral1 sctiesColl) {
        getSctiesColl().add(sctiesColl);
        return this;
    }

    /**
     * Adds a new item to the cshColl list.
     * @see #getCshColl()
     * 
     */
    public Collateral4 addCshColl(CashCollateral1 cshColl) {
        getCshColl().add(cshColl);
        return this;
    }

    /**
     * Adds a new item to the othrColl list.
     * @see #getOthrColl()
     * 
     */
    public Collateral4 addOthrColl(OtherCollateral1 othrColl) {
        getOthrColl().add(othrColl);
        return this;
    }

}
