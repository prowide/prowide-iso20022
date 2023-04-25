
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for catm.004.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "termnlMgmtRjctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.004.001.05")
public class MxCatm00400105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TermnlMgmtRjctn", required = true)
    protected TerminalManagementRejectionV05 termnlMgmtRjctn;
    public static final transient String BUSINESS_PROCESS = "catm";
    public static final transient int FUNCTIONALITY = 4;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorRejection3 .class, GenericIdentification176 .class, GenericIdentification177 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, MxCatm00400105 .class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, PartyType33Code.class, RejectReason2Code.class, TMSHeader1 .class, TerminalManagementRejectionV05 .class, Traceability8 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.004.001.05";

    public MxCatm00400105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00400105(final String xml) {
        this();
        MxCatm00400105 tmp = parse(xml);
        termnlMgmtRjctn = tmp.getTermnlMgmtRjctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00400105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the termnlMgmtRjctn property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementRejectionV05 }
     *     
     */
    public TerminalManagementRejectionV05 getTermnlMgmtRjctn() {
        return termnlMgmtRjctn;
    }

    /**
     * Sets the value of the termnlMgmtRjctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementRejectionV05 }
     *     
     */
    public MxCatm00400105 setTermnlMgmtRjctn(TerminalManagementRejectionV05 value) {
        this.termnlMgmtRjctn = value;
        return this;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCatm00400105 parse(String xml) {
        return ((MxCatm00400105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00400105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00400105 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00400105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00400105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00400105 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00400105) parserImpl.read(MxCatm00400105 .class, xml, _classes));
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
     * Creates an MxCatm00400105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00400105 message
     * @return
     *     a new instance of MxCatm00400105
     */
    public static final MxCatm00400105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00400105 .class);
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

}
