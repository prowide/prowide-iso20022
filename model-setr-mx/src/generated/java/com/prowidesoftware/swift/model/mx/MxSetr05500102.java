
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
 * Class for setr.055.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "swtchOrdrConfCxlInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.055.001.02")
public class MxSetr05500102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SwtchOrdrConfCxlInstr", required = true)
    protected SwitchOrderConfirmationCancellationInstructionV02 swtchOrdrConfCxlInstr;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 55;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference8 .class, AdditionalReference9 .class, AddressType2Code.class, CancellationReason31Choice.class, ConfirmationCancellationReason1Code.class, CopyInformation4 .class, GenericIdentification1 .class, GenericIdentification47 .class, InvestmentFundOrder11 .class, MessageIdentification1 .class, MxSetr05500102 .class, NameAndAddress5 .class, PartyIdentification113 .class, PartyIdentification90Choice.class, PostalAddress1 .class, SwitchOrderConfirmationCancellationInstructionV02 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.055.001.02";

    public MxSetr05500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr05500102(final String xml) {
        this();
        MxSetr05500102 tmp = parse(xml);
        swtchOrdrConfCxlInstr = tmp.getSwtchOrdrConfCxlInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr05500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the swtchOrdrConfCxlInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchOrderConfirmationCancellationInstructionV02 }
     *     
     */
    public SwitchOrderConfirmationCancellationInstructionV02 getSwtchOrdrConfCxlInstr() {
        return swtchOrdrConfCxlInstr;
    }

    /**
     * Sets the value of the swtchOrdrConfCxlInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchOrderConfirmationCancellationInstructionV02 }
     *     
     */
    public MxSetr05500102 setSwtchOrdrConfCxlInstr(SwitchOrderConfirmationCancellationInstructionV02 value) {
        this.swtchOrdrConfCxlInstr = value;
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
    public static MxSetr05500102 parse(String xml) {
        return ((MxSetr05500102) MxReadImpl.parse(MxSetr05500102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr05500102 parse(String xml, MxRead parserImpl) {
        return ((MxSetr05500102) parserImpl.read(MxSetr05500102 .class, xml, _classes));
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
     * Creates an MxSetr05500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr05500102 message
     * @return
     *     a new instance of MxSetr05500102
     */
    public final static MxSetr05500102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr05500102 .class);
    }

}
