
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
 * Order confirmation details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedemptionOrderConfirmation1", propOrder = {
    "amdmntInd",
    "mltplExctnDtls",
    "rltdPtyDtls",
    "xtnsn"
})
public class RedemptionOrderConfirmation1 {

    @XmlElement(name = "AmdmntInd")
    protected boolean amdmntInd;
    @XmlElement(name = "MltplExctnDtls", required = true)
    protected RedemptionMultipleExecution3 mltplExctnDtls;
    @XmlElement(name = "RltdPtyDtls")
    protected List<Intermediary9> rltdPtyDtls;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the amdmntInd property.
     * 
     */
    public boolean isAmdmntInd() {
        return amdmntInd;
    }

    /**
     * Sets the value of the amdmntInd property.
     * 
     */
    public RedemptionOrderConfirmation1 setAmdmntInd(boolean value) {
        this.amdmntInd = value;
        return this;
    }

    /**
     * Gets the value of the mltplExctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionMultipleExecution3 }
     *     
     */
    public RedemptionMultipleExecution3 getMltplExctnDtls() {
        return mltplExctnDtls;
    }

    /**
     * Sets the value of the mltplExctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionMultipleExecution3 }
     *     
     */
    public RedemptionOrderConfirmation1 setMltplExctnDtls(RedemptionMultipleExecution3 value) {
        this.mltplExctnDtls = value;
        return this;
    }

    /**
     * Gets the value of the rltdPtyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdPtyDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdPtyDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary9 }
     * 
     * 
     * @return
     *     The value of the rltdPtyDtls property.
     */
    public List<Intermediary9> getRltdPtyDtls() {
        if (rltdPtyDtls == null) {
            rltdPtyDtls = new ArrayList<>();
        }
        return this.rltdPtyDtls;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
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
     * {@link Extension1 }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
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
     * Adds a new item to the rltdPtyDtls list.
     * @see #getRltdPtyDtls()
     * 
     */
    public RedemptionOrderConfirmation1 addRltdPtyDtls(Intermediary9 rltdPtyDtls) {
        getRltdPtyDtls().add(rltdPtyDtls);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public RedemptionOrderConfirmation1 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
