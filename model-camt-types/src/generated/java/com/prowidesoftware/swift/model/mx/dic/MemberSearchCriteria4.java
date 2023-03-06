
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
 * Defines the criteria used to search for a member.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberSearchCriteria4", propOrder = {
    "id",
    "tp",
    "sts"
})
public class MemberSearchCriteria4 {

    @XmlElement(name = "Id")
    protected List<MemberIdentification3Choice> id;
    @XmlElement(name = "Tp")
    protected List<SystemMemberType1Choice> tp;
    @XmlElement(name = "Sts")
    protected List<SystemMemberStatus1Choice> sts;

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
     * {@link MemberIdentification3Choice }
     * 
     * 
     */
    public List<MemberIdentification3Choice> getId() {
        if (id == null) {
            id = new ArrayList<MemberIdentification3Choice>();
        }
        return this.id;
    }

    /**
     * Gets the value of the tp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemMemberType1Choice }
     * 
     * 
     */
    public List<SystemMemberType1Choice> getTp() {
        if (tp == null) {
            tp = new ArrayList<SystemMemberType1Choice>();
        }
        return this.tp;
    }

    /**
     * Gets the value of the sts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemMemberStatus1Choice }
     * 
     * 
     */
    public List<SystemMemberStatus1Choice> getSts() {
        if (sts == null) {
            sts = new ArrayList<SystemMemberStatus1Choice>();
        }
        return this.sts;
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
    public MemberSearchCriteria4 addId(MemberIdentification3Choice id) {
        getId().add(id);
        return this;
    }

    /**
     * Adds a new item to the tp list.
     * @see #getTp()
     * 
     */
    public MemberSearchCriteria4 addTp(SystemMemberType1Choice tp) {
        getTp().add(tp);
        return this;
    }

    /**
     * Adds a new item to the sts list.
     * @see #getSts()
     * 
     */
    public MemberSearchCriteria4 addSts(SystemMemberStatus1Choice sts) {
        getSts().add(sts);
        return this;
    }

}
