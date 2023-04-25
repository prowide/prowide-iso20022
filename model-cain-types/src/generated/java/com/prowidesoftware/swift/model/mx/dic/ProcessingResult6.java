
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
 * Outcome of the verification processing of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingResult6", propOrder = {
    "rsltData",
    "orgnlRsltData",
    "actnReqrd",
    "actn",
    "addtlActn",
    "addtlInf"
})
public class ProcessingResult6 {

    @XmlElement(name = "RsltData")
    protected ResultData6 rsltData;
    @XmlElement(name = "OrgnlRsltData")
    protected ResultData1 orgnlRsltData;
    @XmlElement(name = "ActnReqrd")
    protected Boolean actnReqrd;
    @XmlElement(name = "Actn")
    protected List<Action9> actn;
    @XmlElement(name = "AddtlActn")
    protected List<AdditionalAction1> addtlActn;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation20> addtlInf;

    /**
     * Gets the value of the rsltData property.
     * 
     * @return
     *     possible object is
     *     {@link ResultData6 }
     *     
     */
    public ResultData6 getRsltData() {
        return rsltData;
    }

    /**
     * Sets the value of the rsltData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultData6 }
     *     
     */
    public ProcessingResult6 setRsltData(ResultData6 value) {
        this.rsltData = value;
        return this;
    }

    /**
     * Gets the value of the orgnlRsltData property.
     * 
     * @return
     *     possible object is
     *     {@link ResultData1 }
     *     
     */
    public ResultData1 getOrgnlRsltData() {
        return orgnlRsltData;
    }

    /**
     * Sets the value of the orgnlRsltData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultData1 }
     *     
     */
    public ProcessingResult6 setOrgnlRsltData(ResultData1 value) {
        this.orgnlRsltData = value;
        return this;
    }

    /**
     * Gets the value of the actnReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActnReqrd() {
        return actnReqrd;
    }

    /**
     * Sets the value of the actnReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ProcessingResult6 setActnReqrd(Boolean value) {
        this.actnReqrd = value;
        return this;
    }

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action9 }
     * 
     * 
     * @return
     *     The value of the actn property.
     */
    public List<Action9> getActn() {
        if (actn == null) {
            actn = new ArrayList<>();
        }
        return this.actn;
    }

    /**
     * Gets the value of the addtlActn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlActn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalAction1 }
     * 
     * 
     * @return
     *     The value of the addtlActn property.
     */
    public List<AdditionalAction1> getAddtlActn() {
        if (addtlActn == null) {
            addtlActn = new ArrayList<>();
        }
        return this.addtlActn;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation20 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation20> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
     * Adds a new item to the actn list.
     * @see #getActn()
     * 
     */
    public ProcessingResult6 addActn(Action9 actn) {
        getActn().add(actn);
        return this;
    }

    /**
     * Adds a new item to the addtlActn list.
     * @see #getAddtlActn()
     * 
     */
    public ProcessingResult6 addAddtlActn(AdditionalAction1 addtlActn) {
        getAddtlActn().add(addtlActn);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public ProcessingResult6 addAddtlInf(AdditionalInformation20 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
