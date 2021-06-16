
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
 * Class for semt.998.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesMgmtPrtryMsg"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.998.001.03")
public class MxSemt99800103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesMgmtPrtryMsg", required = true)
    protected SecuritiesManagementProprietaryMessageV03 sctiesMgmtPrtryMsg;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 998;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {MessageHeader1 .class, MessageReference2 .class, MxSemt99800103 .class, ProprietaryData5 .class, SecuritiesManagementProprietaryMessageV03 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:semt.998.001.03";

    public MxSemt99800103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt99800103(final String xml) {
        this();
        MxSemt99800103 tmp = parse(xml);
        sctiesMgmtPrtryMsg = tmp.getSctiesMgmtPrtryMsg();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt99800103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesMgmtPrtryMsg property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesManagementProprietaryMessageV03 }
     *     
     */
    public SecuritiesManagementProprietaryMessageV03 getSctiesMgmtPrtryMsg() {
        return sctiesMgmtPrtryMsg;
    }

    /**
     * Sets the value of the sctiesMgmtPrtryMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesManagementProprietaryMessageV03 }
     *     
     */
    public MxSemt99800103 setSctiesMgmtPrtryMsg(SecuritiesManagementProprietaryMessageV03 value) {
        this.sctiesMgmtPrtryMsg = value;
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
    public static MxSemt99800103 parse(String xml) {
        return ((MxSemt99800103) MxReadImpl.parse(MxSemt99800103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt99800103 parse(String xml, MxRead parserImpl) {
        return ((MxSemt99800103) parserImpl.read(MxSemt99800103 .class, xml, _classes));
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
     * Creates an MxSemt99800103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt99800103 message
     * @return
     *     a new instance of MxSemt99800103
     */
    public final static MxSemt99800103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt99800103 .class);
    }

}
