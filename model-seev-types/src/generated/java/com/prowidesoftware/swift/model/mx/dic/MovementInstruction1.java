
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
 * Details of the movement instructions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovementInstruction1", propOrder = {
    "mvmntGnlInf",
    "undrlygSctiesMvmntDtls",
    "undrlygCshMvmntDtls",
    "prcdsMvmntDtls"
})
public class MovementInstruction1 {

    @XmlElement(name = "MvmntGnlInf", required = true)
    protected CorporateActionMovement1 mvmntGnlInf;
    @XmlElement(name = "UndrlygSctiesMvmntDtls")
    protected List<UnderlyingSecurityMovement1> undrlygSctiesMvmntDtls;
    @XmlElement(name = "UndrlygCshMvmntDtls")
    protected List<CashMovement2> undrlygCshMvmntDtls;
    @XmlElement(name = "PrcdsMvmntDtls")
    protected List<ProceedsMovement1> prcdsMvmntDtls;

    /**
     * Gets the value of the mvmntGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovement1 }
     *     
     */
    public CorporateActionMovement1 getMvmntGnlInf() {
        return mvmntGnlInf;
    }

    /**
     * Sets the value of the mvmntGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovement1 }
     *     
     */
    public MovementInstruction1 setMvmntGnlInf(CorporateActionMovement1 value) {
        this.mvmntGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the undrlygSctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygSctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingSecurityMovement1 }
     * 
     * 
     */
    public List<UnderlyingSecurityMovement1> getUndrlygSctiesMvmntDtls() {
        if (undrlygSctiesMvmntDtls == null) {
            undrlygSctiesMvmntDtls = new ArrayList<UnderlyingSecurityMovement1>();
        }
        return this.undrlygSctiesMvmntDtls;
    }

    /**
     * Gets the value of the undrlygCshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygCshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashMovement2 }
     * 
     * 
     */
    public List<CashMovement2> getUndrlygCshMvmntDtls() {
        if (undrlygCshMvmntDtls == null) {
            undrlygCshMvmntDtls = new ArrayList<CashMovement2>();
        }
        return this.undrlygCshMvmntDtls;
    }

    /**
     * Gets the value of the prcdsMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prcdsMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrcdsMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProceedsMovement1 }
     * 
     * 
     */
    public List<ProceedsMovement1> getPrcdsMvmntDtls() {
        if (prcdsMvmntDtls == null) {
            prcdsMvmntDtls = new ArrayList<ProceedsMovement1>();
        }
        return this.prcdsMvmntDtls;
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
     * Adds a new item to the undrlygSctiesMvmntDtls list.
     * @see #getUndrlygSctiesMvmntDtls()
     * 
     */
    public MovementInstruction1 addUndrlygSctiesMvmntDtls(UnderlyingSecurityMovement1 undrlygSctiesMvmntDtls) {
        getUndrlygSctiesMvmntDtls().add(undrlygSctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the undrlygCshMvmntDtls list.
     * @see #getUndrlygCshMvmntDtls()
     * 
     */
    public MovementInstruction1 addUndrlygCshMvmntDtls(CashMovement2 undrlygCshMvmntDtls) {
        getUndrlygCshMvmntDtls().add(undrlygCshMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the prcdsMvmntDtls list.
     * @see #getPrcdsMvmntDtls()
     * 
     */
    public MovementInstruction1 addPrcdsMvmntDtls(ProceedsMovement1 prcdsMvmntDtls) {
        getPrcdsMvmntDtls().add(prcdsMvmntDtls);
        return this;
    }

}
