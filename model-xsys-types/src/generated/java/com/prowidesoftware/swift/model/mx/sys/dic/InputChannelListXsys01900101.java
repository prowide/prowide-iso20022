
package com.prowidesoftware.swift.model.mx.sys.dic;

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
 * Java class for InputChannelList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputChannelList", propOrder = {
    "inptChnlDtls"
})
public class InputChannelListXsys01900101 {

    @XmlElement(name = "InptChnlDtls", required = true)
    protected List<InputChannelDetailsXsys01900101> inptChnlDtls;

    /**
     * Gets the value of the inptChnlDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inptChnlDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInptChnlDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InputChannelDetailsXsys01900101 }
     * 
     * 
     */
    public List<InputChannelDetailsXsys01900101> getInptChnlDtls() {
        if (inptChnlDtls == null) {
            inptChnlDtls = new ArrayList<InputChannelDetailsXsys01900101>();
        }
        return this.inptChnlDtls;
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
     * Adds a new item to the inptChnlDtls list.
     * @see #getInptChnlDtls()
     * 
     */
    public InputChannelListXsys01900101 addInptChnlDtls(InputChannelDetailsXsys01900101 inptChnlDtls) {
        getInptChnlDtls().add(inptChnlDtls);
        return this;
    }

}
