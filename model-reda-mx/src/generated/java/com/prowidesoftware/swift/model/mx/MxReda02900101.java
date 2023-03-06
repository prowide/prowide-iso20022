
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for reda.029.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctyMntncStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.029.001.01")
public class MxReda02900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctyMntncStsAdvc", required = true)
    protected SecurityMaintenanceStatusAdviceV01 sctyMntncStsAdvc;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 29;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {GenericIdentification30 .class, IdentificationSource3Choice.class, MessageHeader12 .class, MxReda02900101 .class, NoReasonCode.class, OriginalBusinessInstruction1 .class, OtherIdentification1 .class, ProcessingStatus72Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, Reason18Choice.class, Reason4 .class, SecurityIdentification39 .class, SecurityMaintenanceStatusAdviceV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.029.001.01";

    public MxReda02900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda02900101(final String xml) {
        this();
        MxReda02900101 tmp = parse(xml);
        sctyMntncStsAdvc = tmp.getSctyMntncStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda02900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctyMntncStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityMaintenanceStatusAdviceV01 }
     *     
     */
    public SecurityMaintenanceStatusAdviceV01 getSctyMntncStsAdvc() {
        return sctyMntncStsAdvc;
    }

    /**
     * Sets the value of the sctyMntncStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityMaintenanceStatusAdviceV01 }
     *     
     */
    public MxReda02900101 setSctyMntncStsAdvc(SecurityMaintenanceStatusAdviceV01 value) {
        this.sctyMntncStsAdvc = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxReda02900101 parse(String xml) {
        return ((MxReda02900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda02900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda02900101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda02900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda02900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda02900101 parse(String xml, MxRead parserImpl) {
        return ((MxReda02900101) parserImpl.read(MxReda02900101 .class, xml, _classes));
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
     * Creates an MxReda02900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda02900101 message
     * @return
     *     a new instance of MxReda02900101
     */
    public final static MxReda02900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda02900101 .class);
    }

}
