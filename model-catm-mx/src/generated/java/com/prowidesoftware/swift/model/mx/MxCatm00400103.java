
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for catm.004.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "termnlMgmtRjctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.004.001.03")
public class MxCatm00400103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TermnlMgmtRjctn", required = true)
    protected TerminalManagementRejectionV03 termnlMgmtRjctn;
    public final static transient String BUSINESS_PROCESS = "catm";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorRejection3 .class, GenericIdentification71 .class, Header15 .class, MxCatm00400103 .class, PartyType5Code.class, PartyType6Code.class, RejectReason2Code.class, TerminalManagementRejectionV03 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.004.001.03";

    public MxCatm00400103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00400103(final String xml) {
        this();
        MxCatm00400103 tmp = parse(xml);
        termnlMgmtRjctn = tmp.getTermnlMgmtRjctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00400103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the termnlMgmtRjctn property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementRejectionV03 }
     *     
     */
    public TerminalManagementRejectionV03 getTermnlMgmtRjctn() {
        return termnlMgmtRjctn;
    }

    /**
     * Sets the value of the termnlMgmtRjctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementRejectionV03 }
     *     
     */
    public MxCatm00400103 setTermnlMgmtRjctn(TerminalManagementRejectionV03 value) {
        this.termnlMgmtRjctn = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxCatm00400103 parse(String xml) {
        return ((MxCatm00400103) MxReadImpl.parse(MxCatm00400103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00400103 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00400103) parserImpl.read(MxCatm00400103 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxCatm00400103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00400103 message
     * @return
     *     a new instance of MxCatm00400103
     */
    public final static MxCatm00400103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00400103 .class);
    }

}
