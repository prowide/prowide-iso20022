
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
 * Specifies the query criteria related to securities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeSecurityIdentificationQueryCriteria3", propOrder = {
    "oprtr",
    "id",
    "ctrctTp",
    "isin",
    "unqPdctIdr",
    "undrlygInstrmId"
})
public class TradeSecurityIdentificationQueryCriteria3 {

    @XmlElement(name = "Oprtr", required = true)
    @XmlSchemaType(name = "string")
    protected Operation3Code oprtr;
    @XmlElement(name = "Id")
    protected List<SecurityIdentificationQueryCriteria1> id;
    @XmlElement(name = "CtrctTp")
    @XmlSchemaType(name = "string")
    protected List<FinancialInstrumentContractType2Code> ctrctTp;
    @XmlElement(name = "ISIN")
    protected List<ISINQueryCriteria1> isin;
    @XmlElement(name = "UnqPdctIdr")
    protected List<UPIQueryCriteria1> unqPdctIdr;
    @XmlElement(name = "UndrlygInstrmId")
    protected List<SecurityIdentificationQuery4Choice> undrlygInstrmId;

    /**
     * Gets the value of the oprtr property.
     * 
     * @return
     *     possible object is
     *     {@link Operation3Code }
     *     
     */
    public Operation3Code getOprtr() {
        return oprtr;
    }

    /**
     * Sets the value of the oprtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation3Code }
     *     
     */
    public TradeSecurityIdentificationQueryCriteria3 setOprtr(Operation3Code value) {
        this.oprtr = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentificationQueryCriteria1 }
     * 
     * 
     */
    public List<SecurityIdentificationQueryCriteria1> getId() {
        if (id == null) {
            id = new ArrayList<SecurityIdentificationQueryCriteria1>();
        }
        return this.id;
    }

    /**
     * Gets the value of the ctrctTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctrctTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrctTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentContractType2Code }
     * 
     * 
     */
    public List<FinancialInstrumentContractType2Code> getCtrctTp() {
        if (ctrctTp == null) {
            ctrctTp = new ArrayList<FinancialInstrumentContractType2Code>();
        }
        return this.ctrctTp;
    }

    /**
     * Gets the value of the isin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getISIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ISINQueryCriteria1 }
     * 
     * 
     */
    public List<ISINQueryCriteria1> getISIN() {
        if (isin == null) {
            isin = new ArrayList<ISINQueryCriteria1>();
        }
        return this.isin;
    }

    /**
     * Gets the value of the unqPdctIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unqPdctIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnqPdctIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UPIQueryCriteria1 }
     * 
     * 
     */
    public List<UPIQueryCriteria1> getUnqPdctIdr() {
        if (unqPdctIdr == null) {
            unqPdctIdr = new ArrayList<UPIQueryCriteria1>();
        }
        return this.unqPdctIdr;
    }

    /**
     * Gets the value of the undrlygInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentificationQuery4Choice }
     * 
     * 
     */
    public List<SecurityIdentificationQuery4Choice> getUndrlygInstrmId() {
        if (undrlygInstrmId == null) {
            undrlygInstrmId = new ArrayList<SecurityIdentificationQuery4Choice>();
        }
        return this.undrlygInstrmId;
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
     * Adds a new item to the id list.
     * @see #getId()
     * 
     */
    public TradeSecurityIdentificationQueryCriteria3 addId(SecurityIdentificationQueryCriteria1 id) {
        getId().add(id);
        return this;
    }

    /**
     * Adds a new item to the ctrctTp list.
     * @see #getCtrctTp()
     * 
     */
    public TradeSecurityIdentificationQueryCriteria3 addCtrctTp(FinancialInstrumentContractType2Code ctrctTp) {
        getCtrctTp().add(ctrctTp);
        return this;
    }

    /**
     * Adds a new item to the iSIN list.
     * @see #getISIN()
     * 
     */
    public TradeSecurityIdentificationQueryCriteria3 addISIN(ISINQueryCriteria1 iSIN) {
        getISIN().add(iSIN);
        return this;
    }

    /**
     * Adds a new item to the unqPdctIdr list.
     * @see #getUnqPdctIdr()
     * 
     */
    public TradeSecurityIdentificationQueryCriteria3 addUnqPdctIdr(UPIQueryCriteria1 unqPdctIdr) {
        getUnqPdctIdr().add(unqPdctIdr);
        return this;
    }

    /**
     * Adds a new item to the undrlygInstrmId list.
     * @see #getUndrlygInstrmId()
     * 
     */
    public TradeSecurityIdentificationQueryCriteria3 addUndrlygInstrmId(SecurityIdentificationQuery4Choice undrlygInstrmId) {
        getUndrlygInstrmId().add(undrlygInstrmId);
        return this;
    }

}
