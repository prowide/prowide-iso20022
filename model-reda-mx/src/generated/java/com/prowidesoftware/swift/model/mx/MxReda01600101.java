
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for reda.016.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ptyStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.016.001.01")
public class MxReda01600101
    extends AbstractMX
{

    @XmlElement(name = "PtyStsAdvc", required = true)
    protected PartyStatusAdviceV01 ptyStsAdvc;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, GenericIdentification36 .class, MessageHeader12 .class, MxReda01600101 .class, NameAndAddress5 .class, OriginalBusinessInstruction1 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PartyStatus2 .class, PartyStatusAdviceV01 .class, PostalAddress1 .class, Status6Code.class, StatusReason6Choice.class, StatusReasonInformation10 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.016.001.01";

    public MxReda01600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda01600101(final String xml) {
        this();
        MxReda01600101 tmp = parse(xml);
        ptyStsAdvc = tmp.getPtyStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda01600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ptyStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link PartyStatusAdviceV01 }
     *     
     */
    public PartyStatusAdviceV01 getPtyStsAdvc() {
        return ptyStsAdvc;
    }

    /**
     * Sets the value of the ptyStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyStatusAdviceV01 }
     *     
     */
    public MxReda01600101 setPtyStsAdvc(PartyStatusAdviceV01 value) {
        this.ptyStsAdvc = value;
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
    public static MxReda01600101 parse(String xml) {
        return ((MxReda01600101) MxReadImpl.parse(MxReda01600101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda01600101 parse(String xml, MxRead parserImpl) {
        return ((MxReda01600101) parserImpl.read(MxReda01600101 .class, xml, _classes));
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
     * Creates an MxReda01600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda01600101 message
     * @return
     *     a new instance of MxReda01600101
     */
    public final static MxReda01600101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxReda01600101 .class);
    }

}
