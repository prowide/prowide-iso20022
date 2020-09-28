
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
 * Class for catp.005.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "atmRjct"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catp.005.001.01")
public class MxCatp00500101
    extends AbstractMX
{

    @XmlElement(name = "ATMRjct", required = true)
    protected ATMRejectV01 atmRjct;
    public final static transient String BUSINESS_PROCESS = "catp";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ATMCommand1 .class, ATMCommand1Code.class, ATMCommandIdentification1 .class, ATMCommandParameters1Choice.class, ATMConfigurationParameter1 .class, ATMMessageFunction1 .class, ATMReject1 .class, ATMRejectV01 .class, ATMStatus1Code.class, DataSetCategory7Code.class, GenericIdentification77 .class, Header22 .class, MessageFunction7Code.class, MessageFunction8Code.class, MxCatp00500101 .class, PartyType12Code.class, RejectReason1Code.class, TMSContactLevel2Code.class, Traceability4 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catp.005.001.01";

    public MxCatp00500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatp00500101(final String xml) {
        this();
        MxCatp00500101 tmp = parse(xml);
        atmRjct = tmp.getATMRjct();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatp00500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the atmRjct property.
     * 
     * @return
     *     possible object is
     *     {@link ATMRejectV01 }
     *     
     */
    public ATMRejectV01 getATMRjct() {
        return atmRjct;
    }

    /**
     * Sets the value of the atmRjct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMRejectV01 }
     *     
     */
    public MxCatp00500101 setATMRjct(ATMRejectV01 value) {
        this.atmRjct = value;
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
    public static MxCatp00500101 parse(String xml) {
        return ((MxCatp00500101) MxReadImpl.parse(MxCatp00500101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatp00500101 parse(String xml, MxRead parserImpl) {
        return ((MxCatp00500101) parserImpl.read(MxCatp00500101 .class, xml, _classes));
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
     * Creates an MxCatp00500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatp00500101 message
     * @return
     *     a new instance of MxCatp00500101
     */
    public final static MxCatp00500101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCatp00500101 .class);
    }

}
