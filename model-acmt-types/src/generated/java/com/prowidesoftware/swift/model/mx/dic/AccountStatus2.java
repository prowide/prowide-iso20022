
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
 * Status of an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatus2", propOrder = {
    "nbld",
    "dsbld",
    "pdg",
    "pdgOpng",
    "profrm",
    "clsd",
    "clsrPdg",
    "othr"
})
public class AccountStatus2 {

    @XmlElement(name = "Nbld")
    protected EnabledStatusReason1Choice nbld;
    @XmlElement(name = "Dsbld")
    protected DisabledStatusReason1Choice dsbld;
    @XmlElement(name = "Pdg")
    protected PendingStatusReason1Choice pdg;
    @XmlElement(name = "PdgOpng")
    protected PendingOpeningStatusReason1Choice pdgOpng;
    @XmlElement(name = "Profrm")
    protected ProformaStatusReason1Choice profrm;
    @XmlElement(name = "Clsd")
    protected ClosedStatusReason1Choice clsd;
    @XmlElement(name = "ClsrPdg")
    protected ClosurePendingStatusReason1Choice clsrPdg;
    @XmlElement(name = "Othr")
    protected List<OtherAccountStatus1> othr;

    /**
     * Gets the value of the nbld property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledStatusReason1Choice }
     *     
     */
    public EnabledStatusReason1Choice getNbld() {
        return nbld;
    }

    /**
     * Sets the value of the nbld property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledStatusReason1Choice }
     *     
     */
    public AccountStatus2 setNbld(EnabledStatusReason1Choice value) {
        this.nbld = value;
        return this;
    }

    /**
     * Gets the value of the dsbld property.
     * 
     * @return
     *     possible object is
     *     {@link DisabledStatusReason1Choice }
     *     
     */
    public DisabledStatusReason1Choice getDsbld() {
        return dsbld;
    }

    /**
     * Sets the value of the dsbld property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabledStatusReason1Choice }
     *     
     */
    public AccountStatus2 setDsbld(DisabledStatusReason1Choice value) {
        this.dsbld = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatusReason1Choice }
     *     
     */
    public PendingStatusReason1Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatusReason1Choice }
     *     
     */
    public AccountStatus2 setPdg(PendingStatusReason1Choice value) {
        this.pdg = value;
        return this;
    }

    /**
     * Gets the value of the pdgOpng property.
     * 
     * @return
     *     possible object is
     *     {@link PendingOpeningStatusReason1Choice }
     *     
     */
    public PendingOpeningStatusReason1Choice getPdgOpng() {
        return pdgOpng;
    }

    /**
     * Sets the value of the pdgOpng property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingOpeningStatusReason1Choice }
     *     
     */
    public AccountStatus2 setPdgOpng(PendingOpeningStatusReason1Choice value) {
        this.pdgOpng = value;
        return this;
    }

    /**
     * Gets the value of the profrm property.
     * 
     * @return
     *     possible object is
     *     {@link ProformaStatusReason1Choice }
     *     
     */
    public ProformaStatusReason1Choice getProfrm() {
        return profrm;
    }

    /**
     * Sets the value of the profrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProformaStatusReason1Choice }
     *     
     */
    public AccountStatus2 setProfrm(ProformaStatusReason1Choice value) {
        this.profrm = value;
        return this;
    }

    /**
     * Gets the value of the clsd property.
     * 
     * @return
     *     possible object is
     *     {@link ClosedStatusReason1Choice }
     *     
     */
    public ClosedStatusReason1Choice getClsd() {
        return clsd;
    }

    /**
     * Sets the value of the clsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosedStatusReason1Choice }
     *     
     */
    public AccountStatus2 setClsd(ClosedStatusReason1Choice value) {
        this.clsd = value;
        return this;
    }

    /**
     * Gets the value of the clsrPdg property.
     * 
     * @return
     *     possible object is
     *     {@link ClosurePendingStatusReason1Choice }
     *     
     */
    public ClosurePendingStatusReason1Choice getClsrPdg() {
        return clsrPdg;
    }

    /**
     * Sets the value of the clsrPdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosurePendingStatusReason1Choice }
     *     
     */
    public AccountStatus2 setClsrPdg(ClosurePendingStatusReason1Choice value) {
        this.clsrPdg = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAccountStatus1 }
     * 
     * 
     */
    public List<OtherAccountStatus1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<OtherAccountStatus1>();
        }
        return this.othr;
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
     * Adds a new item to the othr list.
     * @see #getOthr()
     * 
     */
    public AccountStatus2 addOthr(OtherAccountStatus1 othr) {
        getOthr().add(othr);
        return this;
    }

}
